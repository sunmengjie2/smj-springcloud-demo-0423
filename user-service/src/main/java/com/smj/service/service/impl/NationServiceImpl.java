package com.smj.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smj.service.entity.Nation;
import com.smj.service.entity.NationVo;
import com.smj.service.mapper.NationMapper;
import com.smj.service.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author smj
 * @since 2020-04-25
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Autowired
    NationMapper nationMapper;
    @Override
    public List<NationVo> findAll() {
        return nationMapper.findAll();
    }
}
