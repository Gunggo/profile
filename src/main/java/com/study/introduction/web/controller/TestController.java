package com.study.introduction.web.controller;

import com.study.introduction.web.advice.exception.CUserNotFountException;
import com.study.introduction.web.entity.User;
import com.study.introduction.web.model.response.CommonResult;
import com.study.introduction.web.model.response.ListResult;
import com.study.introduction.web.model.response.SingleResult;
import com.study.introduction.web.repo.UserJpaRepo;
import com.study.introduction.web.service.ResponseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"1. User"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class TestController {

    private final UserJpaRepo userJpaRepo;
    private final ResponseService responseService;

    @ApiOperation(value = "회원 리스트 조회", notes = "모든 회원 조회한다")
    @GetMapping("/users")
    public ListResult<User> findAllUser() {
        // 결과 데이터가 여러건이니 getListResult를 이용해서 결과를 출력
        return responseService.getListResult(userJpaRepo.findAll());
    }

    @ApiOperation(value = "회원 개별 조회", notes = "userId로 회원 조회한다")
    @GetMapping("/user/{userId}")
    public SingleResult<User> findUserById(@ApiParam(value = "회원ID", required = true)
                                           @PathVariable int userId,
                                           @ApiParam(value = "언어", defaultValue = "ko")
                                           @RequestParam String lang) {
        // 결과 데이터가 단일건이니 getBasicResult를 이용해서 결과 출력
        return responseService.getSingleResult(userJpaRepo.findById(userId).orElseThrow(CUserNotFountException::new));
    }

    @ApiOperation(value = "회원 가입", notes = "회원 가입")
    @PostMapping("/user")
    public SingleResult<User> save(@ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
                     @ApiParam(value = "회원이름", required = true) @RequestParam String name) {
        User user = User.builder()
                .uid(uid)
                .name(name)
                .build();
        return responseService.getSingleResult(userJpaRepo.save(user));
    }

    @ApiOperation(value = "회원 수정", notes = "회원의 정보를 수정한다")
    @PutMapping("/user")
    public SingleResult<User> modify(
            @ApiParam(value = "회원번호", required = true) @RequestParam long msrl,
            @ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
            @ApiParam(value = "회원이름", required = true) @RequestParam String name) {
        User user = User.builder()
                .msrl(msrl)
                .uid(uid)
                .name(name)
                .build();
        return responseService.getSingleResult(userJpaRepo.save(user));
    }

    @ApiOperation(value = "회원 삭제", notes = "userId로 회원정보를 삭제한다")
    @DeleteMapping("/user/{userId}")
    public CommonResult delete(
            @ApiParam(value = "회원번호", required = true) @PathVariable int userId) {
        userJpaRepo.deleteById(userId);
        return responseService.getSuccessResult();
    }

}
