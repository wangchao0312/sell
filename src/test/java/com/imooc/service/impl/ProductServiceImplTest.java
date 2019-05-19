package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo=productService.findOne("123456");
        System.out.println(productInfo);
    }

    /**
     * 找到所有上架商品
     */
    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList=productService.findUpAll();
        System.out.println(productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request=new PageRequest(1,2);
        Page<ProductInfo> productInfoPage=productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }


    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123458");
        productInfo.setProductName("奶茶");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(4000);
        productInfo.setProductDescription("很好喝的奶茶");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());//枚举类型
        productInfo.setCategoryType(1);
        productService.save(productInfo);
    }
}