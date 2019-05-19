package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by 王超
 * 2019 05 18 14:58分
 * 为什么使用OrderDto因为  每笔订单中都有detail
 * 所以将ordermaster和orderdetail封装在一起
 */
public interface OrderService {

    /** 创建订单. */
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单. */
    OrderDTO findOne(String orderId);

    /** 查询订单及详情列表.使用了分页
     * 所以使用Page对象
     * 入参选择Pageable对象俩个参数*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** 取消订单. */
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完结订单. */
    OrderDTO finish(OrderDTO orderDTO);

//    /** 查询订单列表. */
//    Page<OrderDTO> findList(Pageable pageable);

    /** 支付订单. */
    OrderDTO paid(OrderDTO orderDTO);

}
