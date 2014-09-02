package com.sh.shop.persistence;

import com.sh.shop.domain.BoardPost;
import com.sh.shop.domain.BoardPostExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardPostMapper {
    int countByExample(BoardPostExample example);

    int deleteByExample(BoardPostExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BoardPost record);

    int insertSelective(BoardPost record);

    List<BoardPost> selectByExampleWithBLOBsWithRowbounds(BoardPostExample example, RowBounds rowBounds);

    List<BoardPost> selectByExampleWithBLOBs(BoardPostExample example);

    List<BoardPost> selectByExampleWithRowbounds(BoardPostExample example, RowBounds rowBounds);

    List<BoardPost> selectByExample(BoardPostExample example);

    BoardPost selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BoardPost record, @Param("example") BoardPostExample example);

    int updateByExampleWithBLOBs(@Param("record") BoardPost record, @Param("example") BoardPostExample example);

    int updateByExample(@Param("record") BoardPost record, @Param("example") BoardPostExample example);

    int updateByPrimaryKeySelective(BoardPost record);

    int updateByPrimaryKeyWithBLOBs(BoardPost record);

    int updateByPrimaryKey(BoardPost record);
}