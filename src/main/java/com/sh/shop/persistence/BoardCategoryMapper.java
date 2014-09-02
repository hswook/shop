package com.sh.shop.persistence;

import com.sh.shop.domain.BoardCategory;
import com.sh.shop.domain.BoardCategoryExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardCategoryMapper {
    int countByExample(BoardCategoryExample example);

    int deleteByExample(BoardCategoryExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BoardCategory record);

    int insertSelective(BoardCategory record);

    List<BoardCategory> selectByExampleWithRowbounds(BoardCategoryExample example, RowBounds rowBounds);

    List<BoardCategory> selectByExample(BoardCategoryExample example);

    BoardCategory selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BoardCategory record, @Param("example") BoardCategoryExample example);

    int updateByExample(@Param("record") BoardCategory record, @Param("example") BoardCategoryExample example);

    int updateByPrimaryKeySelective(BoardCategory record);

    int updateByPrimaryKey(BoardCategory record);
}