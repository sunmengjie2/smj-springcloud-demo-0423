package com.smj.service.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smj.service.entity.User;
import com.smj.service.entity.UserVo;
import com.smj.service.mapper.UserMapper;
import com.smj.service.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public IPage<User> selectPageVo(Page page, UserVo vo) {

        return userMapper.selectPageVo(page,vo);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(Integer[] ids) {
        userMapper.deleteBatchIds(Arrays.asList(ids));
    }
}
