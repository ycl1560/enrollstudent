package com.yunhang.controller;

import com.yunhang.dto.NoticeDto;
import com.yunhang.dto.SelectStudentInfoDto;
import com.yunhang.entity.StudentManage;
import com.yunhang.service.SchoolSpecialService;
import com.yunhang.service.StudentManageService;
import com.yunhang.utils.JsonResult;
import com.yunhang.utils.ReturnCode;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/studentinfo/")
public class StudentManageController {

    @Resource
    private StudentManageService studentManageService;
    @RequestMapping("selectstudentinfobyname")
    public JsonResult queryStudentInfoByName(String studentName){

        List<StudentManage> selectStudentInfo=studentManageService.queryStudentInfoByName(studentName);
        return   JsonResult.build(ReturnCode.okayCode,"success",selectStudentInfo);
    }
    @RequestMapping("selectstudentinfobyid")
    public JsonResult queryStudentInfoByName(Integer studentId){

        List<StudentManage> selectStudentInfo=studentManageService.queryStudentInfoById(studentId);
        return   JsonResult.build(ReturnCode.okayCode,"success",selectStudentInfo);
    }

    @RequestMapping(value = "addstudent",method = RequestMethod.POST)
    public JsonResult addstudent(StudentManage studentManage){


        Integer mark=studentManageService.addstudent(studentManage);
        if(mark==1)
        return   JsonResult.build(ReturnCode.okayCode,"success",mark);
        else
        return   JsonResult.build(ReturnCode.objectNull,"failure",mark);

    }

    @RequestMapping(value = "updatestudent",method = RequestMethod.POST)
    public JsonResult updatestudent(StudentManage studentManage){


        Integer mark=studentManageService.updatestudent(studentManage);
        if(mark==1)
        return   JsonResult.build(ReturnCode.okayCode,"success",mark);
        else
        return   JsonResult.build(ReturnCode.objectNull,"failure",mark);

    }

    @RequestMapping(value = "deletestudent",method = RequestMethod.POST)
    public JsonResult deletestudent(StudentManage studentManage){


        Integer mark=studentManageService.deletestudent(studentManage);
        if(mark==1)
        return   JsonResult.build(ReturnCode.okayCode,"success",mark);
        else
        return   JsonResult.build(ReturnCode.objectNull,"failure",mark);

    }



}
