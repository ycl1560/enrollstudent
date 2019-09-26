package com.yunhang.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "special_kindof")
public class SpecialKindof {
    /**
     * 种类下的专业种类编号
     */
    @Id
    @Column(name = "special_kind_id")
    private Integer specialKindId;

    /**
     * 种类下的专业种类名称
     */
    @Column(name = "special_kind_name")
    private String specialKindName;

    /**
     * 关联的专业编号
     */
    @Column(name = "special_id")
    private Integer specialId;
}