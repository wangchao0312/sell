package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JpaRepository<ProductCategory, Integer>
 *     第一个参数为类名，第二个参数为主键数据类型
 *     增删改查不需要写接口的方法了
 * Created by 王超
 * 2019 05 08
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    /**
     * 根据种类信息编号，查询种类    自动封装！！！！
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

