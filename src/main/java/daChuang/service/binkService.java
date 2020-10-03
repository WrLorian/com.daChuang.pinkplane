package daChuang.service;

import daChuang.dao.binkDao;
import daChuang.pojo.bink;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class binkService
{
    @Autowired
    private binkDao binkDao;

    /**
     * TODO 用户新增设备
     * @param bink
     * @return
     */
    public boolean binkInsert(bink bink)
    {
        return binkDao.binkInsert(bink);
    }

    /**
     * TODO 查询该用户所有的设备绑定
     * @param userId
     * @return
     */
    public List<bink> binkSelectByUserId(int userId)
    {
        return binkDao.binkSelectByUserId(userId);
    }


}
