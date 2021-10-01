package com.beijing;

import com.beijing.dao.CityDao;
import com.beijing.daomain.City;
import com.beijing.uilte.MybatisUilte;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TextCity {
    @Test
    public void textSelectCity(){
        SqlSession session = MybatisUilte.getSession();
        CityDao dao = session.getMapper(CityDao.class);
        List<City> daos = dao.SelectCity();
        for (City city : daos) {
            System.out.println(city);
        }
        session.close();
    }
}
