package com.shop.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xufeng
 * @email xudevins@gmail.com
 * @date 2020-11-21 14:17:57
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

