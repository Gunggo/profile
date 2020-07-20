package com.study.introduction.record.controller;

import com.study.introduction.code.service.CodeService;
import com.study.introduction.common.Constants;
import com.study.introduction.common.Criteria;
import com.study.introduction.common.Pagination;
import com.study.introduction.record.service.RecordService;
import com.study.introduction.record.service.RecordServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class RecordController {

    private final RecordService recordService;
    private final CodeService codeService;

    private static final Logger logger = LoggerFactory.getLogger(RecordServiceImpl.class);

    // 게시판 목록 조회
    @GetMapping("/records")
    public String records(@ModelAttribute("criteria")Criteria criteria, Model model) throws Exception {

//        int totCnt = recordService.getRecordListTotCnt();
        int totCnt = 10000;

        model.addAttribute("recordCnt", totCnt);
        model.addAttribute("recordList", recordService.selectRecordList(criteria));

        model.addAttribute("codeList", codeService.selectCodeList(Constants.CODE_TYPE_RECORD));

        return "/record/recordList";
    }
//    // 게시판 목록 조회
//    @GetMapping("/records")
//    public String records(Model model,
//                          @RequestParam(required = false, defaultValue = "1") int page,
//                          @RequestParam(required = false, defaultValue = "1") int currentPage) throws Exception {
//
////        int totCnt = recordService.getRecordListTotCnt();
//        int totCnt = 10000;
//
//        Pagination pagination = new Pagination();
//        pagination.pageInfo(page, currentPage, totCnt);
//
//        model.addAttribute("recordCnt", totCnt);
//        model.addAttribute("pagination", pagination);
//        model.addAttribute("recordList", recordService.selectRecordList(pagination));
//
//        model.addAttribute("codeList", codeService.selectCodeList(Constants.CODE_TYPE_RECORD));
//
//        return "/record/recordList";
//    }

    // 게시판 카테고리 별 목록 조회
    @GetMapping("/records/{recordType}")
    public String recordsCate(Model model,
                              @RequestParam(required = false, defaultValue = "1") int page,
                              @RequestParam(required = false, defaultValue = "1") int currentPage,
                              @PathVariable String recordType) throws Exception {

        int cateCnt = recordService.getRecordListCateCnt(recordType);

        Pagination pagination = new Pagination();
        pagination.pageInfo(page, currentPage, cateCnt);

        model.addAttribute("recordCnt", cateCnt);
        model.addAttribute("pagination", pagination);
        model.addAttribute("recordList", recordService.selectRecordCateList(pagination,recordType));

        model.addAttribute("codeList", codeService.selectCodeList(Constants.CODE_TYPE_RECORD));

        return "/record/recordList";
    }

    // 게시판 등록 폼
    @GetMapping("/record-form")
    public String recordForm(Model model) throws Exception {

        model.addAttribute("codeList", codeService.selectCodeList(Constants.CODE_TYPE_RECORD));

        return "/record/recordForm";
    }

    // 게시글 수정
    @GetMapping("/record-form/{recordNo}")
    public String updateForm(@PathVariable int recordNo, Model model) throws Exception {

        model.addAttribute("record", recordService.selectRecord(recordNo));
        model.addAttribute("codeList", codeService.selectCodeList(Constants.CODE_TYPE_RECORD));

        return "/record/updateRecordForm";
    }

    // 게시글 조회
    @GetMapping("/record/{recordNo}")
    public String record(@PathVariable int recordNo, Model model) throws Exception {

        model.addAttribute("record", recordService.selectRecord(recordNo));

        return "/record/record";
    }
}
