package daChuang.dao;

import daChuang.pojo.equit;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface equitDao
{
    /**
     * TODO 添加新的设备
     * @return
     */
    @Insert("Insert into equit(equitName) values (#{equitName})")
    public boolean equitInsert(equit equit);

    /**
     * TODO 设备信息的更新
     * @param equit
     * @return
     */
    @Update("Update equit set equitName=#{equitName},equitStatus=#{equitStatus} where equitId=#{equitId}")
    public boolean equitUpdate(equit equit);

    /**
     * TODO 删除设备
     * @param equitId
     * @return
     */
    @Delete("delete from equit where equitId=#{equitId}")
    public boolean equitDelete(int equitId);

    /**
     * TODO 显示所有设备
     * @return
     */
    @Select("Select * form equit")
    public List<equit> equitSelectAll();

    /**
     * TODO 查看用户所有的设备
     * @return
     */
    @Select("Select * form equit where equitId=(select equitId from bink where userId=#{userId})")
    public List<equit> equitSelectByUserId(int userId);
}
