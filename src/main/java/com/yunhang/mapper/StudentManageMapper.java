package com.yunhang.mapper;

import com.yunhang.entity.StudentManage;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StudentManageMapper extends Mapper<StudentManage> {

    List<StudentManage> selectStudentInfoByName(String studentName);
    List<StudentManage> selectStudentInfoById(Integer studentId);



}