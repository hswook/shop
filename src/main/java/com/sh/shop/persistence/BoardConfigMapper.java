package com.sh.shop.persistence;

import com.sh.shop.domain.BoardConfig;
import com.sh.shop.domain.BoardConfigExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BoardConfigMapper {
    int countByExample(BoardConfigExample example);

    int deleteByExample(BoardConfigExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BoardConfig record);

    int insertSelective(BoardConfig record);

    List<BoardConfig> selectByExampleWithRowbounds(BoardConfigExample example, RowBounds rowBounds);

    List<BoardConfig> selectByExample(BoardConfigExample example);

    BoardConfig selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BoardConfig record, @Param("example") BoardConfigExample example);

    int updateByExample(@Param("record") BoardConfig record, @Param("example") BoardConfigExample example);

    int updateByPrimaryKeySelective(BoardConfig record);

    int updateByPrimaryKey(BoardConfig record);
}