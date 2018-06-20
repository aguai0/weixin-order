package com.learn.respository;

import com.learn.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long>{

    List<OrderDetail> findByOrOrderId(String orderId);
}
