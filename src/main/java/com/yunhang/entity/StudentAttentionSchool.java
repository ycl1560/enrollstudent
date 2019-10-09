package com.yunhang.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "student_attention_school")
public class StudentAttentionSchool {
    /**
     * 学生编号
     */
    @Column(name = "student_id")
    private Integer studentId;

    /**
     * 学校编号
     */
    @Column(name = "school_id")
    private Integer schoolId;


}