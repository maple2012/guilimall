package com.shop.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author xufeng
 * @email xudevins@gmail.com
 * @date 2020-11-21 14:36:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

