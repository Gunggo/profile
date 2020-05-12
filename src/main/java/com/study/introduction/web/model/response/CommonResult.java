package com.study.introduction.web.model.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {

    @ApiModelProperty("응답 성공여부 : true/false")
    private boolean success;;

    @ApiModelProperty("응답 코드 번호 : >= 0 정상, <0 비정상")
    private int code;

    @ApiModelProperty("응답 메시지")
    private String msg;


}
