package com.xujianjie.oauth2.provider.mapper;

import com.xujianjie.oauth2.provider.model.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper
{
    @Select("select * from user where account = #{account}")
    User findByAccount(@Param("account") String account);
}