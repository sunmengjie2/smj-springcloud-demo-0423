package com.smj.service.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smj.service.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.smj.service.entity.UserVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
public interface IUserService extends IService<User> {

    IPage<User> selectPageVo(Page page, UserVo vo);

    void add(User user);

    void delete(Integer[] ids);
}
