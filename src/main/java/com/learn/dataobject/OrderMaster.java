package com.learn.dataobject;

import com.learn.enums.OrderStatusEnum;
import com.learn.enums.PayStausEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:订单
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-20 by aguai
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    /** '买家名称' */
    private String buyerName;

    /**  买家电话*/
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode() ;

    /** 支付状态，默认0未支付 */
    private Integer payStatus = PayStausEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;
}
