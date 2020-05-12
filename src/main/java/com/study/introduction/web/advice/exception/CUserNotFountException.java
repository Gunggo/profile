package com.study.introduction.web.advice.exception;

public class CUserNotFountException extends RuntimeException {

    public CUserNotFountException(String msg, Throwable t) {
        super(msg, t);
    }

    public CUserNotFountException(String msg) {
        super(msg);
    }
    public CUserNotFountException() {
        super();
    }
}
