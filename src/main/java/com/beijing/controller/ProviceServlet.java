package com.beijing.controller;

import com.beijing.dao.ProviceDao;
import com.beijing.daomain.Province;
import com.beijing.uilte.MybatisUilte;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProviceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String json="{}";
        SqlSession session = MybatisUilte.getSession();
        ProviceDao dao = session.getMapper(ProviceDao.class);
        List<Province> provinces = dao.selectProvice();
        if (provinces!=null){
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(provinces);
        }
        response.setContentType("application/json; charset=UTF-8");
        PrintWriter out= response.getWriter();
        out.println(json);
        out.flush();
        out.close();


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
