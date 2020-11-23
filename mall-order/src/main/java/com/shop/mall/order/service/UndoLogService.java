package com.shop.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.mall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xufeng
 * @email xudevins@gmail.com
 * @date 2020-11-21 14:32:28
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

