package daChuang.dao;

import daChuang.pojo.bink;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface binkDao
{
    /**
     * TODO 用户新增设备
     * @return
     */
    @Insert("insert into bink (equitId,userId) values (#{equitId},#{userId})")
    public boolean binkInsert(bink bink);

    /**
     * TODO 查询该用户所有的设备绑定
     * @return
     */
    @Select("select * from bink where userId =#{userId}")
    public List<bink> binkSelectByUserId(@Param("userId")int userId);
}
