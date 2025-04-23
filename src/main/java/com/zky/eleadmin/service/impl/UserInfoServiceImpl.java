package com.zky.eleadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zky.eleadmin.domain.UserInfo;
import com.zky.eleadmin.service.UserInfoService;
import com.zky.eleadmin.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangkaiyue
* @description 针对表【user_info(用户信息)】的数据库操作Service实现
* @createDate 2025-04-11 20:02:04
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




