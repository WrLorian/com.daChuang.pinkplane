package daChuang.service;

import daChuang.dao.equitDao;
import daChuang.pojo.equit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class equitService
{
    @Autowired
    private equitDao equitdao;

    /**
     * TODO 添加新的设备
     * @param equit
     * @return
     */
    public boolean equitInsert(equit equit)
    {
        return equitdao.equitInsert(equit);
    }

    /**
     * TODO 设备信息的更行
     * @param equit
     * @return
     */
    public boolean equitUpdate(equit equit)
    {
        return equitdao.equitUpdate(equit);
    }

    /**
     * TODO 删除设备
     * @param equitId
     * @return
     */
    public boolean equitDelete(int equitId)
    {
        return equitdao.equitDelete(equitId);
    }

    /**
     * TODo 显示所有设备
     * @return
     */
    public List<equit> equitSelectAll()
    {
        return equitdao.equitSelectAll();
    }

    public List<equit> equitSelectByUserId(int userId)
    {
        return equitdao.equitSelectByUserId(userId);
    }
}
