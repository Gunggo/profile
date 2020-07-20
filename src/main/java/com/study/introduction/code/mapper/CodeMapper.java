package com.study.introduction.code.mapper;

import com.study.introduction.code.dto.CodeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeMapper {

    /** 코드 목록 조회 */
    List<CodeDTO> selectCodeList(String codeGrpName) throws Exception;

}
