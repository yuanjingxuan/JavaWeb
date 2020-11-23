package servlets;

import com.demo.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student=new Student();
        student.setName(request.getParameter("name"));
        student.setSno(request.getParameter("sno"));
        System.out.println(student.getSno());
        ServletContext application=this.getServletContext();
        application= (ServletContext) student;
        RequestDispatcher rd=application.getRequestDispatcher("/servlets/SecondServlet");
        rd.forward(request,response);
    }
}
