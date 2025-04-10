package com.zky.eleadmin.mapper;

import com.zky.eleadmin.domain.AuthorInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangkaiyue
* @description 针对表【author_info(作者信息)】的数据库操作Mapper
* @createDate 2025-04-10 23:29:02
* @Entity com.zky.eleadmin.domain.AuthorInfo
*/
@Mapper
public interface AuthorInfoMapper extends BaseMapper<AuthorInfo> {

}




