package com.learn.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:商品信息
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-11 by aguai
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String  productIcon;

    /** 商品状态,0正常1下架*/
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
