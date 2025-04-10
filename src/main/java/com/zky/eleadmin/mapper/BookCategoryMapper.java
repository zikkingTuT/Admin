package com.zky.eleadmin.mapper;

import com.zky.eleadmin.domain.BookCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangkaiyue
* @description 针对表【book_category(小说类别)】的数据库操作Mapper
* @createDate 2025-04-10 23:29:02
* @Entity com.zky.eleadmin.domain.BookCategory
*/
@Mapper
public interface BookCategoryMapper extends BaseMapper<BookCategory> {

}




