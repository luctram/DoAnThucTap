/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TramLuc
 */
public class Servlet_ForgetPass extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        String error = "";
        if (phone.equals("")) {
            error = "Chưa nhập sdt";
            request.setAttribute("error", error);
        }
        if (username.equals("")) {
            error = "Chưa nhập ten";
            request.setAttribute("error", error);
        }
        if (email.equals("")) {
            error = "Chưa nhập email";
            request.setAttribute("error", error);
        }

        try {
            if (error.length() == 0) {
                String result = UserDAO.getInfoByUsernameToCheck(username);
                String[] str = result.split("[/]"); //cắt chuỗi "phone/email"
                if ( phone.equals(str[0]) && email.equals(str[1])){
                    response.sendRedirect("http://localhost:8080/MXH/ResetPassword.jsp");
                }
                else{
                        //sai
                        response.sendRedirect("http://localhost:8080/MXH/FormLogin.jsp");
                        }
            } else {
                //Nhập rỗng
                response.sendRedirect("http://localhost:8080/MXH/CheckAcc.jsp");
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String pass1 = request.getParameter("password");
        String pass2 = request.getParameter("verifypassword");

        String error = "";
        if (pass1.equals("")) {
            error = "Chưa nhập pass";
            request.setAttribute("error", error);
        }
        if (pass2.equals("")) {
            error = "Chưa nhập pass";
            request.setAttribute("error", error);
        }

        try {
            if (error.length() == 0) {
                if (pass2.equals(pass1)){
                    User u = new User();
                    u.setPassword(pass1);
                    UserDAO.ResetPass(u);

                }
            } else {
                //Nhập rỗng
                response.sendRedirect("http://localhost:8080/MXH/CheckAcc.jsp");
            }
        } catch (Exception e) {
        }
    }
}
