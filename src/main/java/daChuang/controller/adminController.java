package daChuang.controller;

import daChuang.pojo.admin;
import daChuang.pojo.user;
import daChuang.service.adminService;
import daChuang.service.userService;
import daChuang.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

public class adminController
{

    private static final int size = 10;
    @Autowired
    private adminService adminservice;
    @Autowired
    private userService userService;

    /**
     * TODO 管理员登录
     *
     * @param admin
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(admin admin, HttpServletRequest request)
    {
        if (adminservice.adminSelectByAdminUserNameAndAdminPassWord(admin.getAdminUserName(), admin.getAdminPassWord()))
        {
            request.getSession().setAttribute("admin", admin.getAdminName());
            request.setAttribute("id", admin.getAdminId());
            return "mine";
        }
        if (!adminservice.adminSelectByAdminUserNameAndAdminPassWord(admin.getAdminUserName(), admin.getAdminPassWord()))
        {
            request.setAttribute("msg", "用户密码错误");
        }
        System.out.println("密码错误");
        return "login";
    }

    /**
     * TODO 管理员注销
     *
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request)
    {
        request.getSession().removeAttribute("admin");
        return "login";
    }

    @RequestMapping("/adminList")
    public String adminList(HttpServletRequest request,
                            @RequestParam(required = false, defaultValue = "1") int page)
    {
        request.setAttribute("adminList", adminservice.adminSelectAll(page, size));
        request.setAttribute("pageTool", PageUtil.getPageToolAdmin(request, adminservice.adminSelectTotal(), page, size));

        return "admin/pages/admin-list";
    }

    /**
     * 跳转到添加管理员界面
     *
     * @return
     */
    @RequestMapping("/adminAd")
    public String adminAd()
    {
        return "admin/pages/admin-add";
    }

    /**
     * TODO 添加管理员页面的添加操作
     *
     * @param request
     * @param admin
     * @return
     */
    @RequestMapping("/adminAdd")
    public String adminAdd(HttpServletRequest request, admin admin)
    {
        if (adminservice.isExist(admin.getAdminUserName()))
        {
            request.setAttribute("msg", "用户名已存在!");
            return "admin/pages/admin-list";
        }
        adminservice.adminInsert(admin);
        return "redirect:adminList";
    }

    /**
     * TODO 跳转管理员注册页面
     *
     * @return
     */
    @RequestMapping("/adminRe")
    public String adminRe()
    {
        return "admin/pages/register";
    }

    /**
     * TODO 管理员注册
     *
     * @param request
     * @param admin
     * @return
     */
    @RequestMapping("/adminRegister")
    public String adminRegister(HttpServletRequest request, admin admin)
    {
        if ("确认".equals(request.getParameter("confirm")))
        {
            request.setAttribute("msg", "用户密码错误");
            if (admin.getAdminName().isEmpty())
            {
                request.setAttribute("msg", "用户名不能为空!");
                return "admin/pages/register";
            } else if (adminservice.isExist(admin.getAdminName()))
            {
                request.setAttribute("msg", "用户名已存在!");
                return "admin/pages/register";
            } else
            {
                adminservice.adminInsert(admin);
                request.setAttribute("msg", "注册成功, 请登录!");
                return "redirect:login";
            }
        }
        return "admin/pages/register";
    }

    /**
     * TODO 跳转到重置管理员密码页面（需获取需要更改的管理员的ID）
     *
     * @param request
     * @param adminId
     * @return
     */
    @RequestMapping("/adminRePwd")
    public String adminResetPwd(HttpServletRequest request, int adminId)
    {
        request.setAttribute("adminPwd", adminservice.adminSelectById(adminId));
        return "admin/pages/admin-modify";
    }

    /**
     * TODO 重置管理员密码
     *
     * @param admin
     * @return
     */
    @RequestMapping("/adminRePWD")
    public String adminResetPWD(admin admin)
    {
        adminservice.adminUpdate(admin);
        return "redirect:adminList";
    }

    /**
     * TODO 删除管理员
     *
     * @param adminId
     * @return
     */
    @RequestMapping("/adminDelete")
    public String adminDelete(int adminId)
    {
        adminservice.adminDelete(adminId);
        return "redirect:adminList";
    }

    /**
     * TODO 用户列表
     * @param request
     * @param page
     * @return
     */
    @RequestMapping("/userList")
    public String userList(HttpServletRequest request,
                           @RequestParam(required = false, defaultValue = "1") int page)
    {
        request.setAttribute("userList", userService.userSelectList(page,size));
        request.setAttribute("pageTool",PageUtil.getPageToolAdmin(request,userService.userSelectTotal(),page,size));
        return "/admin/pages/user-list";
    }

    /**
     * TODO 跳转到用户添加界面
     * @return
     */
    @RequestMapping("/userAd")
    public String userAd()
    {
        return "/admin/pages/user-add";
    }

    /**
     * TODO 用户添加界面
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/userAdd")
    public String userAdd(user user,HttpServletRequest request)
    {
        if(userService.isExist(user.getUserUserName()))
        {
            request.setAttribute("msg","用户名已存在！");
            return "redirect:userList";
        }
        userService.userInsert(user);
        return "redirect:userList";
    }

    /**
     * TODO 用户密码重置
     * @param user
     * @return
     */
    @RequestMapping("/userResetPwd")
    public String userResetPwd(user user)
    {
        userService.userUpdate(user);
        return "redirect:userList";
    }

    /**
     * TODO 跳转到用户更新界面
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/userUp")
    public String userUp(int id,HttpServletRequest request)
    {
        request.setAttribute("userMo",userService.userSelectByUserId(id));
        return "/admin/pages/user-modify";
    }

    /**
     * TODO 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/userDelete")
    public String userDelete(int id)
    {
        userService.userDelete(id);
        return "redirect:userList";
    }

    @RequestMapping("/userSelectByUserUserName")
    public String userSelectByUserUserName(HttpServletRequest request,String userUserName)
    {
        request.setAttribute("user",userService.userSelectByUserUserName(userUserName));
        return "redirect:userList";
    }

}
