package com.sh.shop.persistence;

import com.sh.shop.domain.BoardSchedule;
import com.sh.shop.domain.BoardScheduleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BoardScheduleMapper {
    int countByExample(BoardScheduleExample example);

    int deleteByExample(BoardScheduleExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BoardSchedule record);

    int insertSelective(BoardSchedule record);

    List<BoardSchedule> selectByExampleWithRowbounds(BoardScheduleExample example, RowBounds rowBounds);

    List<BoardSchedule> selectByExample(BoardScheduleExample example);

    BoardSchedule selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BoardSchedule record, @Param("example") BoardScheduleExample example);

    int updateByExample(@Param("record") BoardSchedule record, @Param("example") BoardScheduleExample example);

    int updateByPrimaryKeySelective(BoardSchedule record);

    int updateByPrimaryKey(BoardSchedule record);
}