package com.sh.shop.persistence;

import com.sh.shop.domain.BoardFile;
import com.sh.shop.domain.BoardFileExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardFileMapper {
    int countByExample(BoardFileExample example);

    int deleteByExample(BoardFileExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BoardFile record);

    int insertSelective(BoardFile record);

    List<BoardFile> selectByExampleWithRowbounds(BoardFileExample example, RowBounds rowBounds);

    List<BoardFile> selectByExample(BoardFileExample example);

    BoardFile selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BoardFile record, @Param("example") BoardFileExample example);

    int updateByExample(@Param("record") BoardFile record, @Param("example") BoardFileExample example);

    int updateByPrimaryKeySelective(BoardFile record);

    int updateByPrimaryKey(BoardFile record);
}