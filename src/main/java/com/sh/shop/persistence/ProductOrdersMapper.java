package com.sh.shop.persistence;

import com.sh.shop.domain.ProductOrders;
import com.sh.shop.domain.ProductOrdersExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrdersMapper {
    int countByExample(ProductOrdersExample example);

    int deleteByExample(ProductOrdersExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ProductOrders record);

    int insertSelective(ProductOrders record);

    List<ProductOrders> selectByExampleWithRowbounds(ProductOrdersExample example, RowBounds rowBounds);

    List<ProductOrders> selectByExample(ProductOrdersExample example);

    ProductOrders selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ProductOrders record, @Param("example") ProductOrdersExample example);

    int updateByExample(@Param("record") ProductOrders record, @Param("example") ProductOrdersExample example);

    int updateByPrimaryKeySelective(ProductOrders record);

    int updateByPrimaryKey(ProductOrders record);
}