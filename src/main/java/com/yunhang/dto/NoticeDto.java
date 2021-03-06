package com.yunhang.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * @author yangchunlu
 * @date 2019-9-28
 */
@Data
public class NoticeDto {


    /**
     * 公告编号
     */
    @Id
    @Column(name = "notice_id")
    private String noticeId;

    /**
     * 公告名称
     */
    @Column(name = "notice_name")
    private String noticeName;

    /**
     * 公告内容
     */
    @Column(name = "notice_content")
    private String noticeContent;

    //学校名称
    private String schoolName;



}
