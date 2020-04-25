package com.smj.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smj.service.entity.Nation;
import com.smj.service.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author smj
 * @since 2020-04-25
 */
public interface NationMapper extends BaseMapper<Nation> {

    List<NationVo> findAll();
}
