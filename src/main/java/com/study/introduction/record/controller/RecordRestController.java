package com.study.introduction.record.controller;

import com.google.gson.JsonObject;
import com.study.introduction.common.Constants;
import com.study.introduction.record.dto.RecordDTO;
import com.study.introduction.record.service.RecordService;
import com.study.introduction.record.service.RecordServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class RecordRestController {

    private final RecordService recordService;

    private static final Logger logger = LoggerFactory.getLogger(RecordServiceImpl.class);

    // 썸머노트 이미지 업로드
    @PostMapping("/recordImg")
    public JsonObject recordImg(@RequestParam("file") MultipartFile multipartFile) throws Exception{

        return recordService.recordImg(multipartFile);

    }

    // 게시글 등록
    @PostMapping("/record")
    public Map<String, Object> insertRecord(RecordDTO recordDTO) {
        Map<String, Object> resultMap = new HashMap<>();

        String result = "", resultMsg = "";

        try {
            int resultCnt = recordService.insertRecord(recordDTO);

            if (resultCnt != 0) {
                result = Constants.OK;
                resultMsg = Constants.RESULT_MSG_INSERT_OK;
            } else {
                result = Constants.FAIL;
                resultMsg = Constants.RESULT_MSG_INSERT_FAIL;
            }
        } catch (Exception e) {
            result = Constants.FAIL;
            resultMsg = Constants.RESULT_MSG_ERROR;
        }

        resultMap.put("result", result);
        resultMap.put("resultMsg", resultMsg);

        return resultMap;
    }

    // 게시글 수정
    @PutMapping("/record")
    public Map<String, Object> updateRecord(RecordDTO recordDTO) {
        Map<String, Object> resultMap = new HashMap<>();

        String result = "", resultMsg = "";

        try {
            int resultCnt = recordService.updateRecord(recordDTO);

            if (resultCnt != 0) {
                result = Constants.OK;
                resultMsg = Constants.RESULT_MSG_UPDATE_OK;
            } else {
                result = Constants.FAIL;
                resultMsg = Constants.RESULT_MSG_UPDATE_FAIL;
            }
        } catch (Exception e) {
            result = Constants.FAIL;
            resultMsg = Constants.RESULT_MSG_ERROR;
        }

        resultMap.put("result", result);
        resultMap.put("resultMsg", resultMsg);

        return resultMap;
    }

    // 게시글 삭제
    @DeleteMapping("/record")
    public Map<String, Object> deleteRecord(@RequestParam int recordNo) {
        Map<String, Object> resultMap = new HashMap<>();

        String result = "", resultMsg = "";

        try {
            int resultCnt = recordService.deleteRecord(recordNo);

            if (resultCnt != 0) {
                result = Constants.OK;
                resultMsg = Constants.RESULT_MSG_DELETE_OK;
            } else {
                result = Constants.FAIL;
                resultMsg = Constants.RESULT_MSG_DELETE_FAIL;
            }
        } catch (Exception e) {
            result = Constants.FAIL;
            resultMsg = Constants.RESULT_MSG_ERROR;
        }

        resultMap.put("result", result);
        resultMap.put("resultMsg", resultMsg);

        return resultMap;
    }

}
