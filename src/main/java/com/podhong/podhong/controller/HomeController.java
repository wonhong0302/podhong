package com.podhong.podhong.controller;

import com.podhong.podhong.domain.SampleVO;
import com.podhong.podhong.service.sample.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/*")
@RequiredArgsConstructor
public class HomeController {

    private final SampleService sampleService;

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/sample")
    @ResponseBody
    public SampleVO sample(@RequestBody SampleVO map) {
//        String sample_no = map.getSampleDesc();
        return map;
    }

    @GetMapping("/sample2")
    @ResponseBody
    public List<SampleVO> sample2(@RequestBody SampleVO map) {
        try{
            List<SampleVO> svo = sampleService.samplesql();
            return svo;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}