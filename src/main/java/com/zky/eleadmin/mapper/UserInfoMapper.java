package com.zky.eleadmin.mapper;

import com.zky.eleadmin.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangkaiyue
* @description 针对表【user_info(用户信息)】的数据库操作Mapper
* @createDate 2025-04-11 20:02:04
* @Entity com.zky.eleadmin.domain.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




