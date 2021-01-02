package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 包名:com.itheima.controller
 *
 * @author ZhangLongBao
 * 日期2020-12-28  17:06
 * <p>
 * @RequestMapping属性：
 *  Value与Path 绑定url与方法
 *  method: 请求的方法，GET,PUT,POST,DELETE....
 *                   restful规范
 *                   GET 获取资源 user 查询用户  GetMapping
 *                   PUT 更新资源  更新user     PutMapping
 *                   POST 添加资源 添加user     PostMapping
 *                   DELETE 删除资源 删除user   DeleteMapping
 *   param【了解】 请求中必须带上参数与值 name=value 写死
 *   headers【了解】: 请求头信息必须带的key=value，value写死了
 * </p>
 */
@Controller
@RequestMapping(value = "/hello")
public class UserController {
    @RequestMapping(value = "/sayHello",method = RequestMethod.POST)
    // @GetMapping("/salyHello") = 上面
    public String sayHello(){
        System.out.println("Hello Jacky chen Nice to meet you!");
        return "success";
    }

    @RequestMapping(path = "/add",params = {"name=zhangsan"})
    public String add(){
        System.out.println("Hello Jacky chen Nice to meet you!");
        return "success";
    }


    @RequestMapping(value = "/update",headers = {"content-type=text/*"})
    public String update(){
        System.out.println("Hello Jacky chen Nice to meet you!");
        return "success";
    }
}
