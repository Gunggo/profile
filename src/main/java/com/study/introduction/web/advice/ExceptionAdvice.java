package com.study.introduction.web.advice;

import com.study.introduction.web.advice.exception.CUserNotFountException;
import com.study.introduction.web.model.response.CommonResult;
import com.study.introduction.web.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice(basePackages = "com.study.introduction.web")
public class ExceptionAdvice {

    private final ResponseService responseService;

//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    protected CommonResult defaultException(HttpServletRequest request, Exception e) {
//        return responseService.getFailResult();
//    }

    @ExceptionHandler(CUserNotFountException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected CommonResult userNotFoundException(HttpServletRequest request, CUserNotFountException e) {
        return responseService.getFailResult();
    }
}
