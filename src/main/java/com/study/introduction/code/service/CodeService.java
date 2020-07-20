package com.study.introduction.code.service;

import com.study.introduction.code.dto.CodeDTO;

import java.util.List;

public interface CodeService {

    /** 코드 목록 조회 */
    List<CodeDTO> selectCodeList(String codeGrpName) throws Exception;
}
