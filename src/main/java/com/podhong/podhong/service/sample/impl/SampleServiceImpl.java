package com.podhong.podhong.service.sample.impl;

import com.podhong.podhong.domain.SampleVO;
import com.podhong.podhong.mapper.SampleMapper;
import com.podhong.podhong.service.sample.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleMapper sampleMapper;

    @Override
    public List<SampleVO> samplesql(){
        return sampleMapper.samplesql();
    }

}
