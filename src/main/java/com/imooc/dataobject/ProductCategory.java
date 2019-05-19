package com.imooc.dataobject;

import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 表名和类名使用驼峰命名法，springboot帮我们做的,@Entity是映射字段的类
 * @DynamicUpdate 动态更新数据库时间字段
 * @Data  lombok下的注解,可以省略getter和setter  和toString 方法
 * 打包成jar包的时候，已经生成了getter和setter方法，所以对性能没有影响
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    //类ID
    @Id    //主键
    @GeneratedValue   //自增
    private Integer categoryId;//数据库为自增
    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
    public ProductCategory(){}

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
