package daChuang.dao;

import daChuang.pojo.admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface adminDao
{
    /**
     * TODO 查询所有Admin
     */
    @Select("select * from admin order by adminId desc limit #{begin},#{size}")
    public List<admin> adminSelectAll(@Param("begin")int begin,@Param("size")int size);

    /**
     * TODO 通过ID查询Admin
     */
    @Select("select * from admin where adminId=#{adminId}")
    public admin adminSelectById(int adminId);

    /**
     * TODO 通过用户名查询Admin
     */
    @Select("select * from admin where adminName like #{adminName} limit 1")
    public admin adminSelectByName(@Param("adminName")String adminName);

    /**
     * TODO 通过账号查询Admin
     */
    @Select("select * from admin where adminUserName like #{adminUserName}")
    public List<admin> adminSelectByAdminUserName(@Param("adminUserName")String adminUserName);

    /**
     * TODO 通过ID 查询Admin列表
     */
    @Select("select * from admin where adminId = #{adminId}")
    public List<admin> adminSelectList(int adminId);

    /**
     * TODO 匹配账号和密码
     * 由于此处如果查询出多条记录会抛异常, 所以加上limit防止数据引起的错误
     */
    @Select("select * from admin where adminUserName=#{adminUserName} and adminPassWord=#{adminPassWord} limit 1")
    public admin adminSelectByAdminUserNameAndAdminPassWord(@Param("adminUserName")String adminUserName, @Param("adminPassWord")String adminPassWord);

    /**
     * TODO 获取管理员的总数
     * @return
     */
    @Select("select count(*) from admin")
    public long adminSelectTotal();

    /**
     * TODO 插入Admin
     * @return
     */
    @Insert("insert into admin (adminUserName,adminName,adminPassWord) values (#{adminUserName},#{adminName},#{adminPassWord})")
    public boolean adminInsert(admin admin);

    /**
     * TODO 修改Admin信息
     * @return
     */
    @Update("update admin set adminUserName=#{adminUserName},adminName=#{adminName},adminPassWord=#{adminPassWord} where adminId=#{adminId}")
    public boolean adminUpdate(admin admin);

    /**
     * TODO 删除管理员
     */
    @Delete("delete from admin where adminId=#{adminId}")
    public boolean adminDelete(int adminId);
}
