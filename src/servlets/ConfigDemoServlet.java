package servlets;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigDemoServlet extends HttpServlet{
    String servletName=null;
    //ServletConfig config=null;
    String email=null;
    String telephone=null;
    ServletContext coon=null;

    public void init() {
//        config = getServletConfig();
//        servletName = config.getServletName();
//        email = config.getInitParameter("email");
//        telephone = config.getInitParameter("telephone");
        coon=getServletContext();
        servletName=coon.getServletContextName();
        email=coon.getContextPath();
        telephone=coon.getContextPath();
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Servlet名称："+servletName+"<br>");
        out.println("Email地址："+email+"<br>");
        out.println("电话："+telephone);
        out.println("</body></html>");
        System.out.println(email);
        System.out.println(telephone);
    }
}