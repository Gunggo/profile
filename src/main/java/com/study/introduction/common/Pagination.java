package com.study.introduction.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination {

    /** 게시글 수 */
    private int listSize = 6;                //초기값으로 목록개수를 6으로 셋팅
    /** 페이지 수 */
    private int rangeSize = 5;            //초기값으로 페이지범위를 5으로 셋팅
    /** 현재 페이지 */
    private int page;
    /** 페이지 범위 (1~10, 11~20) */
    private int range;
    /** 총 게시글 수 */
    private int listCnt;
    /** 총 페이지 수 */
    private int pageCnt;
    /** 시작 페이지 */
    private int startPage;
    /** 시작 게시글 */
    private int startList;
    /** 끝 페이지 */
    private int endPage;
    /** 이전버튼 */
    private boolean prev;
    /** 다음버튼 */
    private boolean next;

    public void pageInfo(int page, int range, int listCnt) {
        this.page = page;
        this.range = range;
        this.listCnt = listCnt;
        //전체 페이지수
        this.pageCnt = listCnt / rangeSize;

        if (pageCnt % rangeSize > 0) {
            pageCnt++;
        }
        // 잘못된 페이지 보정
        if (pageCnt < page) {
            page = pageCnt;
        }
        //시작 페이지
        this.startPage = ((page - 1) / 10) * 10 + 1;
        //끝 페이지
        this.endPage = startPage + rangeSize - 1;
        //게시판 시작번호
        this.startList = (page - 1) * listSize;
        //이전 버튼 상태
        this.prev = range != 1;
        //다음 버튼 상태
        this.next = endPage <= pageCnt;

        if (this.endPage > this.pageCnt) {
            this.endPage = this.pageCnt;
            this.next = false;
        }
    }
}
