package com.yunhang.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yunhang.mapper.SchoolManageMapper;
@Service
public class SchoolManageService{

    @Resource
    private SchoolManageMapper schoolManageMapper;

}
