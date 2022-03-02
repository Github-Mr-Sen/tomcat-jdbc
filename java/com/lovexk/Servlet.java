package com.lovexk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author: 张在森
 * @date: 2022/2/28 17:21
 *
 * 测试
 */
public class Servlet extends HttpServlet {

    public Servlet() {
        System.out.println("sevlet init.....");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setCharacterEncoding("utf-8");  这种方式不管用，依然乱码
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().print( new String("servlet message :  爱你，许珂".getBytes(StandardCharsets.UTF_8)));
    }
}
