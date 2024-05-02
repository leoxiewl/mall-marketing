package com.leo.mallmarketing.mapper;

import com.leo.mallmarketing.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author brianxie
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-05-02 20:56:11
* @Entity com.leo.mallmarketing.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




