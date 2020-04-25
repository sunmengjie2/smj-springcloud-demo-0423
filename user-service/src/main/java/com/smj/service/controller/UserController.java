package com.smj.service.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smj.service.entity.User;
import com.smj.service.entity.UserVo;
import com.smj.service.service.IUserService;
import com.smj.service.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("list")
    public IPage<User> list(Page page, UserVo vo){
        System.out.println(vo);
        return iUserService.selectPageVo(page,vo);
    }

    @PostMapping("add")
    public ResultEntity add(@RequestBody User user){

        try {
            iUserService.add(user);
            return  ResultEntity.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  ResultEntity.error("添加失败");
    }

    @PostMapping("update")
    public ResultEntity update(@RequestBody User user){

        try {
            iUserService.updateById(user);
            return  ResultEntity.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  ResultEntity.error("修改失败");
    }

    @PostMapping("delete")
    public ResultEntity delete(Integer id){

        try {
            iUserService.removeById(id);
            return  ResultEntity.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  ResultEntity.error("删除失败");
    }

    @PostMapping("deletes")
    public ResultEntity deletes(Integer[] ids){

        try {
            iUserService.delete(ids);
            return  ResultEntity.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  ResultEntity.error("删除失败");
    }
}

