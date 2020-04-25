package com.smj.service.controller;


import com.smj.service.entity.Nation;
import com.smj.service.entity.NationVo;
import com.smj.service.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author smj
 * @since 2020-04-25
 */
@RestController
@RequestMapping("/nation/")
public class NationController {

    @Autowired
    INationService iNationService;

    @RequestMapping("list")
    public List<NationVo> findAll(){
        return iNationService.findAll();
    }
}

