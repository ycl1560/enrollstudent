package com.yunhang.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yunhang.mapper.SpecialKindMapper;
@Service
public class SpecialKindService{

    @Resource
    private SpecialKindMapper specialKindMapper;

}
