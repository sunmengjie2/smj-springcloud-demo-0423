package com.smj.service.service.impl;

import com.smj.service.entity.Order;
import com.smj.service.mapper.OrderMapper;
import com.smj.service.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
