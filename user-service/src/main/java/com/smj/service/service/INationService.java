package com.smj.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smj.service.entity.Nation;
import com.smj.service.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author smj
 * @since 2020-04-25
 */
public interface INationService extends IService<Nation> {

    List<NationVo> findAll();
}
