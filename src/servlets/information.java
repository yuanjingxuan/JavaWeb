package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class information extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out=response.getWriter();
        request.setCharacterEncoding("gb2312");
        String unnamed=request.getParameter("unnamed");
        String email=request.getParameter("email");
        out.println("<html>");
        out.println("<body");
        out.println("用户名:"+unnamed+"<br>");
        out.println("E-mail:"+email+"<br>");
        out.println("</body>");
        out.println("</html>");
    }
}
