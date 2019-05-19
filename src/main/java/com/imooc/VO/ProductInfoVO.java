package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品详情,前端需要什么数据，后端就给传什么样的数据，这也是为什么用这个类作为传输数据的类的原因，
 * 另一方面，保护隐私，不把额外数据给暴露出来
 * 对应API.md文件（前端需求文件）
 * Created by 廖师兄
 * 2017-05-12 14:25
 */
@Data
public class ProductInfoVO {
    //注释的作用就是对应前端参数名，
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
