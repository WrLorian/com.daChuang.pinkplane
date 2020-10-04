package daChuang.service;

import daChuang.dao.adminDao;
import daChuang.pojo.admin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class adminService
{
    @Autowired
    private adminDao admindao;

    /**
     * TODO 查询所有Admin
     * @param begin
     * @param size
     * @return
     */
    public List<admin> adminSelectAll(int begin,int size)
    {
        return admindao.adminSelectAll(begin,size);
    }

    /**
     * TODO 通过ID查询Admin
     * @param adminId
     * @return
     */
    public admin adminSelectById(int adminId)
    {
        return admindao.adminSelectById(adminId);
    }

    /**
     * TODO 通过用户名查询Admin
     * @param adminName
     * @return
     */
    public admin adminSelectByName(String adminName)
    {
        return admindao.adminSelectByName(adminName);
    }

    /**
     * TODO 通过账号查询Admin
     * @param adminUserName
     * @return
     */
    public List<admin> adminSelectByAdminUserName(String adminUserName)
    {
        return admindao.adminSelectByAdminUserName(adminUserName);
    }

    /**
     * TODO 通过ID 查询Admin列表
     * @param adminId
     * @return
     */
    public List<admin> adminSelectList(int adminId)
    {
        return admindao.adminSelectList(adminId);
    }

    /**
     * TODO 匹配账号和密码
     * @param adminUserName
     * @param adminPassWord
     * @return
     */
    public boolean adminSelectByAdminUserNameAndAdminPassWord(String adminUserName,String adminPassWord)
    {
        return Objects.nonNull(admindao.adminSelectByAdminUserNameAndAdminPassWord(adminUserName,adminPassWord));
    }

    /**
     * TODO 获取管理员的总数
     * @return
     */
    public long adminSelectTotal()
    {
        return admindao.adminSelectTotal();
    }

    /**
     * TODO 插入Admin
     * @param admin
     * @return
     */
    public boolean adminInsert(admin admin)
    {
        return admindao.adminInsert(admin);
    }

    /**
     * TODO 判断用户名是否存在
     * @param adminUserName
     * @return
     */
    public boolean isExist(String adminUserName)
    {
        return Objects.nonNull(admindao.adminSelectByName(adminUserName));
    }
    /**
     * TODO 修改Admin信息
     * @param admin
     * @return
     */
    public boolean adminUpdate(admin admin)
    {
        return admindao.adminUpdate(admin);
    }

    /**
     * TODO 删除管理员
     * @param adminId
     * @return
     */
    public boolean adminDelete(int adminId)
    {
        return admindao.adminDelete(adminId);
    }

}
