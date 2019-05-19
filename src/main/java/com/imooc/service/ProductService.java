package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    //根据商品Id查询商品信息
    ProductInfo findOne(String productId);

    //查询所有 在架 商品列表   对于浏览用户
    List<ProductInfo> findUpAll();

    //分页查询所有商品信息
    Page<ProductInfo> findAll(Pageable pageable);

    //插入商品信息
    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
