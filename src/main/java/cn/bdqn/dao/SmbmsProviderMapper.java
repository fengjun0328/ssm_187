package cn.bdqn.dao;

import cn.bdqn.pojo.SmbmsProvider;
import cn.bdqn.pojo.SmbmsProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsProviderMapper {
    int countByExample(SmbmsProviderExample example);

    int deleteByExample(SmbmsProviderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmbmsProvider record);

    int insertSelective(SmbmsProvider record);

    List<SmbmsProvider> selectByExample(SmbmsProviderExample example);

    SmbmsProvider selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmbmsProvider record, @Param("example") SmbmsProviderExample example);

    int updateByExample(@Param("record") SmbmsProvider record, @Param("example") SmbmsProviderExample example);

    int updateByPrimaryKeySelective(SmbmsProvider record);

    int updateByPrimaryKey(SmbmsProvider record);
}