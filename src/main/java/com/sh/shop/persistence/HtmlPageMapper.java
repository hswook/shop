package com.sh.shop.persistence;

import com.sh.shop.domain.HtmlPage;
import com.sh.shop.domain.HtmlPageExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HtmlPageMapper {
    int countByExample(HtmlPageExample example);

    int deleteByExample(HtmlPageExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(HtmlPage record);

    int insertSelective(HtmlPage record);

    List<HtmlPage> selectByExampleWithBLOBsWithRowbounds(HtmlPageExample example, RowBounds rowBounds);

    List<HtmlPage> selectByExampleWithBLOBs(HtmlPageExample example);

    List<HtmlPage> selectByExampleWithRowbounds(HtmlPageExample example, RowBounds rowBounds);

    List<HtmlPage> selectByExample(HtmlPageExample example);

    HtmlPage selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") HtmlPage record, @Param("example") HtmlPageExample example);

    int updateByExampleWithBLOBs(@Param("record") HtmlPage record, @Param("example") HtmlPageExample example);

    int updateByExample(@Param("record") HtmlPage record, @Param("example") HtmlPageExample example);

    int updateByPrimaryKeySelective(HtmlPage record);

    int updateByPrimaryKeyWithBLOBs(HtmlPage record);

    int updateByPrimaryKey(HtmlPage record);
}