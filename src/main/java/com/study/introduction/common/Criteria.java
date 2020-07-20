package com.study.introduction.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {

    // 현재 페이지 번호
    private int currentPageNo;
    // 페이지당 출력한 데이터 개수
    private int recordsPerPage;
    // 화면 하단에 출력한 페이지 사이즈
    private int pageSize;
    // 검색 키워드
    private String schKeyword;
    // 검색 유형
    private String schType;

    public Criteria() {
        this.currentPageNo = 1;
        this.recordsPerPage = 6;
        this.pageSize = 5;
    }

}
