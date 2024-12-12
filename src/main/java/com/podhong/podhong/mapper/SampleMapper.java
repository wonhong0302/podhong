package com.podhong.podhong.mapper;

import com.podhong.podhong.domain.SampleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

    public List<SampleVO> samplesql();

}
