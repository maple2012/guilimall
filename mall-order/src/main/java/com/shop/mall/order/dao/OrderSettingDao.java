package com.shop.mall.order.dao;

import com.shop.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author xufeng
 * @email xudevins@gmail.com
 * @date 2020-11-21 14:32:28
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
