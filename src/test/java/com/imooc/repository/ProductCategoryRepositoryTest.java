package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory=repository.findOne(2);
        System.out.println(productCategory.toString());
    }

    /**
     * 如果不设置主键即为保存数据到数据库
     * 如果设置主键，即为更新操作
     *
     * 测试层如果加入@Transactional 即结果都不会保存到数据库，和service层不太一样
     */
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory("曾玉琴",1);
        ProductCategory result=repository.save(productCategory);
        System.out.println(result);

    }


    @Test
    public void findByCategoryTypeInTest(){
            List<Integer> list= Arrays.asList(2,8,3,1);
            List<ProductCategory> result=repository.findByCategoryTypeIn(list);
            Assert.assertNotEquals(0,result);
    }


}