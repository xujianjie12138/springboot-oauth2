package com.xujianjie.oauth2.client.mapper;

import com.xujianjie.oauth2.client.model.po.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper
{
    @Insert("insert into user(user_id, account, password, nick_name, mobile, third_account, access_token, refresh_token) values(" +
            "#{user.userId}, " +
            "#{user.account}, " +
            "#{user.password}, " +
            "#{user.nickName}, " +
            "#{user.mobile}, " +
            "#{user.thirdAccount}, "+
            "#{user.accessToken}, "+
            "#{user.refreshToken})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int insert(@Param("user") User user);

    @Select("select * from user where user_id = #{userId}")
    User findById(@Param("userId") int userId);

    @Select("select * from user where third_account = #{thirdAccount}")
    User findByThirdAccount(@Param("thirdAccount") String thirdAccount);

    @Select("select * from user where account = #{account}")
    User findByAccount(@Param("account") String account);

    @Update("update user set " +
            "account = #{user.account}, " +
            "password = #{user.password}, " +
            "nick_name = #{user.nickName}, " +
            "mobile = #{user.mobile}, " +
            "access_token = #{user.accessToken}, " +
            "refresh_token = #{user.refreshToken} " +
            "where user_id = #{user.userId}")
    int update(@Param("user") User user);
}