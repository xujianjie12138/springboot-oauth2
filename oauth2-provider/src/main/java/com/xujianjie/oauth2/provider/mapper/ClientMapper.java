package com.xujianjie.oauth2.provider.mapper;

import com.xujianjie.oauth2.provider.model.Client;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClientMapper
{
    @Select("select * from client where account = #{account}")
    Client findByAccount(@Param("account") String account);
}