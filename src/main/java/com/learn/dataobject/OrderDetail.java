package com.learn.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Description:订单详情
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-20 by aguai
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private Long  detailId;

    /**订单id */
    private String  orderId ;

    /** 产品id */
    private Integer  productId;
    
    /**  商品名称 */
    private Integer  productName;

    /** 商品价格  */
    private Integer  productPrice;

    /** 商品数量  */
    private Integer  productQuantity;

    /** 商品小图 */
    private Integer  productIcon;

    /** 创建时间  */
    private Date createTime;

    /** 更新时间  */
    private Date  updateTime;
}
