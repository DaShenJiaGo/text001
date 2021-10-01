package com.beijing;

import com.beijing.dao.ProviceDao;
import com.beijing.daomain.Province;
import com.beijing.uilte.MybatisUilte;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Text01 {
    @Test
    public  void textProvice(){
        SqlSession session = MybatisUilte.getSession();
        ProviceDao dao=session.getMapper(ProviceDao.class);
        List<Province> provinces = dao.selectProvice();
        for (Province daos:provinces){
            System.out.println(daos);
        }
        session.close();
    }
}
