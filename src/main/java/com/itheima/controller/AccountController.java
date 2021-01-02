package com.itheima.controller;

import com.itheima.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包名:com.itheima.controller
 *
 * @author ZhangLongBao
 * 日期2020-12-28  19:57
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(value = "/add")
    public String add(String name, double money) {
        System.out.println("name=" + name);
        System.out.println("money=" + money);
        System.out.println("添加账户...");
        return "success";
    }
    //要求表单中参数名称和 POJO 类的属性名称保持一致。并且控制器方法的参数类型是 POJO 类型 .
    @PostMapping("/update")
    public String update(@RequestBody Account account) {
        System.out.println("更新账户..."+account);
        return "success";
    }

    @RequestMapping("/findByIds")
    public String findByIds(Integer[] ids){
        for (Integer id : ids) {
            System.out.println(id);
        }
        return "success";
    }
    //请求转发到页面
    @RequestMapping(value = "/forwardToPage")
    public String forwardToPage(){
        System.out.println("请求转发");
        return "forward:/WEB-INF/pages/success.jsp";
    }
    //重定向到页面,如果是重定向到 jsp 页面，则 jsp 页面不能写在 WEB-INF 目录中，否则无法找到。
    @RequestMapping("redirectToPage")
    public String redirectToPage(){
        System.out.println("redirectToPage...");
        System.out.println("重定向成功");
        return "redirect:/redirect.jsp";
    }
}
