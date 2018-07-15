/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author TramLuc
 */

@WebServlet("/Servlet_Login")
public class Servlet_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("pass"); 
        String error = "";
        if (username.equals("")) {
            error = "Chưa nhập tên đăng nhập";
            request.setAttribute("error", error);
        }

        if (password.equals("")) {
            error = "Chưa nhập mật khẩu";
            request.setAttribute("error", error);
        }

        try {
            if (error.length() == 0) {
                User u = new User();
                ArrayList<User> acc = UserDAO.getAcc();
                System.out.println("CCCCCCCCCCCCCCCCC"); 
              for (int i = 0; i < acc.size(); i++) {
                    if (username.equals(acc.get(i).getUserName() ) && password.equals(acc.get(i).getPassword())) {
                         System.out.println("DDDDDDDDDDDDDDDDD   : "+acc.get(i).getUserName() );
                        response.sendRedirect("http://localhost:8080/MXH/Home.jsp");
                        System.out.println("EEEEEEEEEEEEEEEE");
                    }else {
                        //Sai username/ pass
                        response.sendRedirect("http://localhost:8080/MXH/FormLogin.jsp");
                    }
                }
            } else {
                //Nhập rỗng
                response.sendRedirect("http://localhost:8080/MXH/FormLogin.jsp");
            }
        } catch (Exception e) {
        }
    }
}
