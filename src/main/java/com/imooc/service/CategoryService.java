package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {
    //查询一条类目信息   卖家端
    ProductCategory findOne(Integer categoryId);
    //查询所有商品种类   卖家端
    List<ProductCategory> findAll();
    //根据商品种类编号   查询商品种类信息
    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
    //新增
    ProductCategory save(ProductCategory productCategory);


}
