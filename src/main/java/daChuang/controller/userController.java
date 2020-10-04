package daChuang.controller;

import daChuang.pojo.user;
import daChuang.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public class userController
{
    @Autowired
    private userService userService;

    /**
     * TODO 跳转到用户注册
     * @return
     */
    @RequestMapping("/reg")
    public String reg()
    {
        return "index/register";
    }

    /**
     * TODO 注册用户按钮实现
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(HttpServletRequest request, user user)
    {
        if(user.getUserEmail().isEmpty()||user.getUserPassWord().isEmpty())
        {
            request.setAttribute("msg","用户名或密码不能为空");
            return "index/register";
        }
        else if(userService.isExist(user.getUserUserName()))
        {
            request.setAttribute("msg","用户名已存在");
            return "index/register";
        }
        else
        {
            userService.userInsert(user);
            request.setAttribute("msg","注册成功，请登录！");
            return "redirect:index";
        }
    }

    /**
     * TODO 跳转用户登录
     * @return
     */
    @RequestMapping("/log")
    public String log()
    {
        return "index/login";
    }

    /**
     * TODO 用户登录
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/userLogin")
    public String login(HttpServletRequest request,user user)
    {
        request.setAttribute("flag",6);
        if(userService.userSelectByUserUserNameAndPassWord(user.getUserUserName(),user.getUserPassWord()))
        {
            request.getSession().setAttribute("username",user.getUserName());
            return "redirect:index";
        }
        else if(user.getUserUserName().isEmpty()||user.getUserPassWord().isEmpty())
        {
            request.setAttribute("msg","用户名或密码为空");
            return "index/index";
        }
        else
        {
            request.setAttribute("msg","用户名或密码错误");
            return "index/login";
        }
    }

    /**
     * TODO 用户注销
     * @param request
     * @return
     */
    @RequestMapping("userLoggout")
    public String logout(HttpServletRequest request)
    {
        request.getSession().removeAttribute("username");
        return "index/login";
    }


}
