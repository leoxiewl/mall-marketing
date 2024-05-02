package com.leo.mallmarketing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leo.mallmarketing.entity.User;
import com.leo.mallmarketing.service.UserService;
import com.leo.mallmarketing.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author brianxie
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-05-02 20:56:11
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




