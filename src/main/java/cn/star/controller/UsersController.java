package cn.star.controller;
import cn.star.domain.Users;
import cn.star.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 查询用户
     * @param model
     * @return
     */
    @RequestMapping("/findUsers")
    public String findUsers(Model model){
        System.out.println("表现层：查询用户");
        //调用service对象的方法进行测试
        List<Users> list = usersService.findUsers();
        model.addAttribute("list",list);
        return "Users";
    }

    /**
     * 用户注册
     * @param users
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Users users) {
        System.out.println("注册");
        // 调用注入的 usersService 调用 insertUsers 方法
        usersService.insertUsers(users);
        return "success";
    }

    /**
     * 用户登录
     * @param users
     * @return
     */
    @RequestMapping("/login")
    public String login(Users users) {
        System.out.println("登录");
        // 调用注入的 usersService 调用 login 方法
        if(usersService.login(users)){
//            session.setAttribute("username",users.getUsername());
            return "successlogin";
        }else{
            return "falselogin";
        }
    }

    /**
     * 修改密码
     * @param users
     * @return
     */
    @RequestMapping("/update")
    public String update(Users users) {
        System.out.println("修改密码");
        usersService.update(users);
        return "updatesuccess";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String update(int id) {
        System.out.println("删除用户");
        usersService.delete(id);
        return "deletesuccess";
    }
}