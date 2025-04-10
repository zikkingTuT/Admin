package com.zky.eleadmin.mapper;

import com.zky.eleadmin.domain.BookChapter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangkaiyue
* @description 针对表【book_chapter(小说章节)】的数据库操作Mapper
* @createDate 2025-04-10 23:29:02
* @Entity com.zky.eleadmin.domain.BookChapter
*/
@Mapper
public interface BookChapterMapper extends BaseMapper<BookChapter> {

}




