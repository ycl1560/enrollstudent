package com.yunhang.mapper;

import com.yunhang.entity.Notice;
import tk.mybatis.mapper.common.Mapper;
@org.apache.ibatis.annotations.Mapper
public interface NoticeMapper extends Mapper<Notice> {
    Notice addNotice(Notice notice);
}