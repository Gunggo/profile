package com.study.introduction.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.resource.PathResourceResolver;

/*
    서버 보안설정
    hasIpAddress(ip) – 접근자의 IP주소가 매칭 하는지 확인합니다.
    hasRole(role) – 역할이 부여된 권한(Granted Authority)과 일치하는지 확인합니다.
    hasAnyRole(role) – 부여된 역할 중 일치하는 항목이 있는지 확인합니다.
    ex) access = “hasAnyRole(‘ROLE_USER’,’ROLE_ADMIN’)”
    permitAll – 모든 접근자를 항상 승인합니다.
    denyAll – 모든 사용자의 접근을 거부합니다.
    anonymous – 사용자가 익명 사용자인지 확인합니다.
    authenticated – 인증된 사용자인지 확인합니다.
    rememberMe – 사용자가 remember me를 사용해 인증했는지 확인합니다.
    fullyAuthenticated – 사용자가 모든 크리덴셜을 갖춘 상태에서 인증했는지 확인합니다.
 */

@RequiredArgsConstructor
@Configuration
public class SpringSecurity extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
//                .formLogin().disable()  // rest api이므로 기본설정 안함, 기본설정은 비인증시 로그인폼으로 리다이렉트
                .csrf().disable() // rest api이므로 csrf 보안 필요없음
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // jwt token으로 인증하니 세션 필요없음
                .and()
                .authorizeRequests() // 다음 리퀘스트에 대한 사용권한 체크
                .antMatchers("/*/signin", "/*/signup","/index","/forgot","/test").permitAll() // 가입 및 인증 주소는 누구나 접근가능
                .antMatchers(HttpMethod.GET, "/").permitAll() // 해당 패턴으로 시작하는 GET여ㅛ청은 누구나 접근가능
                .anyRequest().hasRole("USER") // 그 외 나머지 요청은 모두 인증된 회원만 접근가능
                .and()
                .exceptionHandling().accessDeniedHandler(new CustomAccessDeniedHandler())
                .and()
                .exceptionHandling().authenticationEntryPoint(new CustomAuthenticationEntryPoint()) // 커스텀 예외처리
                .and()
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider),
                        UsernamePasswordAuthenticationFilter.class); // jwt token 필터를 id/password 인증 필터 전에 넣는다
    }

    @Override // swagger resource, 기본 페이지, css, js 예외처리
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/v2/api-docs", "/swagger-resources/**","/swagger-ui.html", "/webjars/**",
                "/swagger/**","/resources/**").anyRequest();
    }
}
