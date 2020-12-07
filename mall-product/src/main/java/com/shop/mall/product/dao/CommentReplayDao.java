package com.shop.mall.product.dao;

import com.shop.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author xufeng
 * @email xudevins@gmail.com
 * @date 2020-11-21 10:44:01
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
