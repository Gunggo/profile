package com.study.introduction.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginationInfo {

    // 페이징 계산에 필요한 파라미터들이 담긴 클래스
    private Criteria criteria;
    // 전체 데이터 갯수
    private int totalRecordCnt;
    // 전페 페이지 갯수
    private int totalPageCnt;
    // 페이지 리스트의 첫 페이지 번호
    private int firstPage;
    // 페이지 리스트의 마지막 페이지 번호
    private int lastPage;
    // SQL의 조건절에 사용되는 첫 RNUM
    private int firstRecordIndex;
    // 이전 페이지 존재 여부
    private boolean hasPrev;
    // 다음 페이지 존배 여부
    private boolean hasNext;

    public PaginationInfo(Criteria criteria) {
        if (criteria.getCurrentPageNo() < 1) {
            criteria.setCurrentPageNo(1);
        }
        if (criteria.getRecordsPerPage() < 1 || criteria.getRecordsPerPage() > 100) {
            criteria.setRecordsPerPage(6);
        }
        if (criteria.getPageSize() < 5 || criteria.getPageSize() > 20) {
            criteria.setPageSize(5);
        }
        this.criteria = criteria;
    }

    public void setTotalRecordCnt(int totalRecordCnt) {
        this.totalRecordCnt = totalRecordCnt;

        if (totalRecordCnt > 0) {
            calculation();
        }
    }

    private void calculation() {

        // 전체 페이지 수 (현재 페이지 번호가 전체 페이지 수보다 크면 현재 페이지 번호에 전체 페이지 수를 저장)
        totalPageCnt = ((totalRecordCnt - 1) / criteria.getRecordsPerPage()) + 1;
        if (criteria.getCurrentPageNo() > totalPageCnt) {
            criteria.setCurrentPageNo(totalPageCnt);
        }
        // 페이지 리스트의 첫 페이지 번호
        firstPage = ((criteria.getCurrentPageNo() - 1) / criteria.getPageSize()) * criteria.getPageSize() + 1;
        // 페이지 리스트의 마지막 페이지 번호 (마지막 페이지가 전체 페이지 수보다 크면 마지막 페이지에 전체 페이자 수를 저장)
        lastPage = firstPage + criteria.getPageSize() - 1;
        if(lastPage > totalPageCnt) {
            lastPage = totalPageCnt;
        }
        // SQL의 조건절 첫 RNUM
        firstRecordIndex = (criteria.getCurrentPageNo() - 1) * criteria.getRecordsPerPage();
        // 이전 페이지 여부
        hasPrev = firstPage != 1;
        // 다음 페이지 여부
        hasNext = (lastPage * criteria.getRecordsPerPage()) < totalRecordCnt;

    }
}
