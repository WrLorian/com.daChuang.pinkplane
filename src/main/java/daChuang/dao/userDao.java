package daChuang.dao;

import daChuang.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface userDao
{
    /**
     * TODO 增加用户（注册）
     */
    @Insert("Insert into user (userUserName,userName,userPassWord,userEmail,userPhone) values (#{userUserName},#{userName},#{userPassWord},#{userEmail},#{userPhone})")
    @SelectKey(before=false, keyProperty="userId", resultType=Integer.class, statement="SELECT LAST_INSERT_ID()")
    public boolean userInsert(user user);

    /**
     * TODO 删除用户
     */
    @Delete("delete from user where userId=#{userId}")
    public boolean userDelete(int userId);

    /**
     * TODO 修改用户信息
     */
    @Update("update user set userUserName=#{userUserName},userName=#{userName},userPassWord=#{userPassWord},userEmail=#{userEmail},userPhone=#{userPhone}")
    public boolean userUpdate(user user);

    /**
     * TODO 根据用户ID查询用户
     */
    @Select("select * from user where userId=#{userId}")
    public user userSelectByUserId(int userId);

    /**
     * TODO 查询所有用户
     */
    @Select("select * from user order by userId desc limit #{begin}, #{size}")
    public List<user> userSelectList(@Param("begin")int begin, @Param("size")int size);

    /**
     * TODO 查询用户总数
     */
    @Select("select count(*) from user")
    public long userSelectTotal();

    /**
     * TODO 通过名称搜索用户
     */
    @Select("select * from user where userName=#{userName} limit 1")
    public user userSelectByUsername(@Param("userName")String userName);

    /**
     * TODO 通过账号搜索用户
     */
    @Select("select * from user where userUserName=#{userUserName}")
    public user userSelectByUserUserName(@Param("userUserName")String userUserName);

    /**
     * TODO 用户登录
     */
    @Select("select * from user where userUserName=#{userUserName} and userPassWord=#{userPassWord}")
    public user userSelectByUserUserNameAndPassword(@Param("userUserName")String userUserName, @Param("userPassWord")String userPassWord);
}
