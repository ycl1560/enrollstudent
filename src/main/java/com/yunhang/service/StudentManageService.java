package com.yunhang.service;

import com.yunhang.entity.StudentManage;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yunhang.mapper.StudentManageMapper;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class StudentManageService{

    @Resource
    private StudentManageMapper studentManageMapper;
    //通过Name查询学生信息
    public List<StudentManage> queryStudentInfoByName(String studentName){


        if(StringUtils.isEmpty(studentName)) return null;
        else {
            List<StudentManage> result= studentManageMapper.selectStudentInfoByName(studentName);
            return  result;

        }
    }

    //通过Id查询学生信息
    public List<StudentManage> queryStudentInfoById(Integer studentId){


        if(StringUtils.isEmpty(studentId)) return null;
        else {
            List<StudentManage> result= studentManageMapper.selectStudentInfoById(studentId);
            return  result;
        }
    }


    //添加学生
    public Integer addstudent(StudentManage studentManage){
        int mark = studentManageMapper.insertSelective(studentManage);
        if (mark>0)return 1;
        else return 0;
    }

    //更新学生信息
    public Integer updatestudent(StudentManage studentManage){
        int mark = studentManageMapper.updateByPrimaryKey(studentManage);
        if (mark>0)return 1;
        else return 0;
    }

    //删除学生信息
    public Integer deletestudent(StudentManage studentManage){
        studentManage.setMark((short) 8);
        int mark = studentManageMapper.updateByPrimaryKeySelective(studentManage);
        if (mark>0)return 1;
        else return 0;
    }




    }


