package com.smj.service.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smj.service.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smj.service.entity.UserVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<User> selectPageVo(Page page, UserVo vo);
}
