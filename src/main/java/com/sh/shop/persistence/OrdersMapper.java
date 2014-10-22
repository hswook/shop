package com.sh.shop.persistence;

import com.sh.shop.domain.Cart;
import com.sh.shop.domain.Orders;
import com.sh.shop.domain.OrdersExample;
import com.sh.shop.domain.Product;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExampleWithRowbounds(OrdersExample example, RowBounds rowBounds);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(BigDecimal id);

    List<Cart> selectCartsByOrdersKey(BigDecimal id);
    
    List<Cart> selectCartsByMemberEmail(String email);
    
    List<Cart> selectPurchaseListByMemberEmail(String email);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}