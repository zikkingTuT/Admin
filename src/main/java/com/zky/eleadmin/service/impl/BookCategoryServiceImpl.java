package com.zky.eleadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zky.eleadmin.domain.BookCategory;
import com.zky.eleadmin.service.BookCategoryService;
import com.zky.eleadmin.mapper.BookCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangkaiyue
* @description 针对表【book_category(小说类别)】的数据库操作Service实现
* @createDate 2025-04-10 23:29:02
*/
@Service
public class BookCategoryServiceImpl extends ServiceImpl<BookCategoryMapper, BookCategory>
    implements BookCategoryService{

}




