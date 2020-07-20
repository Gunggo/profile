package com.study.introduction.code.service;

import com.study.introduction.code.dto.CodeDTO;
import com.study.introduction.code.mapper.CodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService {

    private final CodeMapper codeMapper;

    /** 코드 목록 조회 */
    public List<CodeDTO> selectCodeList(String codeGrpName) throws Exception {
        return codeMapper.selectCodeList(codeGrpName);
    }
}
