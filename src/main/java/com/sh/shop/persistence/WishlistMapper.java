package com.sh.shop.persistence;

import com.sh.shop.domain.Product;
import com.sh.shop.domain.Wishlist;
import com.sh.shop.domain.WishlistExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistMapper {
    int countByExample(WishlistExample example);

    int deleteByExample(WishlistExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Wishlist record);

    int insertSelective(Wishlist record);

    List<Wishlist> selectByExampleWithRowbounds(WishlistExample example, RowBounds rowBounds);

    List<Wishlist> selectByExample(WishlistExample example);

    Wishlist selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Wishlist record, @Param("example") WishlistExample example);

    int updateByExample(@Param("record") Wishlist record, @Param("example") WishlistExample example);

    int updateByPrimaryKeySelective(Wishlist record);

    int updateByPrimaryKey(Wishlist record);
    
    List<Product> selectProductListByMemberEmail(String email);
}