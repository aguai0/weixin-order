package com.learn.respository;

import com.learn.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:商品dao
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-11 by aguai
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
