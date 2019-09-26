package com.yunhang.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "special_kind")
public class SpecialKind {
    /**
     * 专业种类编号
     */
    @Column(name = "kind_id")
    private Integer kindId;

    /**
     * 专业种类名称
     */
    @Column(name = "kind_name")
    private String kindName;
}