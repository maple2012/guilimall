package com.shop.mall.member.feign;

import com.shop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 要调服务的服务名
@FeignClient("mall-coupon")
public interface CouponFeighService {
    // 要调的服务的全 url
    @RequestMapping("coupon/coupon//member/list")
    public R memberCoupon();
}
