package com.yunhang.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yunhang.mapper.SchoolSpecialMapper;
@Service
public class SchoolSpecialService{

    @Resource
    private SchoolSpecialMapper schoolSpecialMapper;

}
