package com.shop.mall.product;

import com.shop.mall.product.entity.BrandEntity;
import com.shop.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("xxxx");
		brandEntity.setDescript("hhah");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

}
