package daChuang.service;

import daChuang.dao.userDao;
import daChuang.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userService
{
    @Autowired
    private userDao userdao;

    /**
     * TODO 增加用户（注册）
     * @param user
     * @return
     */
    public boolean userInsert(user user)
    {
        return userdao.userInsert(user);
    }

    /**
     * TODO 删除用户
     * @param userId
     * @return
     */
    public boolean userDelete(int userId)
    {
        return userdao.userDelete(userId);
    }

    /**
     * TODO 修改用户信息
     * @param user
     * @return
     */
    public boolean userUpdate(user user)
    {
        return userdao.userUpdate(user);
    }

    /**
     * TODO 根据用户ID查询用户
     * @param userId
     * @return
     */
    public user userSelectByUserId(int userId)
    {
        return userdao.userSelectByUserId(userId);
    }

    /**
     * TODO 查询所有用户
     * @param begin
     * @param size
     * @return
     */
    public List<user> userSelectList(int begin,int size)
    {
        return userdao.userSelectList(begin,size);
    }

    /**
     * TODO 查询用户总数
     * @return
     */
    public long userSelectTotal()
    {
        return userdao.userSelectTotal();
    }

    /**
     * TODO 通过账户搜索用户
     * @param userUserName
     * @return
     */
    public user userSelectByUserUserName(String userUserName)
    {
        return userdao.userSelectByUserUserName(userUserName);
    }

    /**
     * TODO 用户登录
     * @param userUserName
     * @param passWord
     * @return
     */
    public user userSelectByUserUserNameAndPassWord(String userUserName,String passWord)
    {
        return userdao.userSelectByUserUserNameAndPassword(userUserName, passWord);
    }
}
