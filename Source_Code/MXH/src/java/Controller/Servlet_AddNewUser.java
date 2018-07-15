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
public class Servlet_AddNewUser extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password1 = request.getParameter("password1"); 
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String error = "";
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAA");
        if (username.equals("")) {
            error = "Chưa nhập tên đăng nhập";
            request.setAttribute("error", error);
        }

        if (password.equals("")) {
            error = "Chưa nhập mật khẩu";
            request.setAttribute("error", error);
        }
        if (password1.equals("") && password1.equals(password)) {
            error = "Chưa xác nhận mật khẩu";
            request.setAttribute("error", error);
        }
        if (phone.equals("")) {
            error = "Chưa nhập số điện thoại";
            request.setAttribute("error", error);
        }
        if (email.equals("")) {
            error = "Chưa nhập email";
            request.setAttribute("error", error);
        }
        
        if (name.equals("")) {
            error = "Chưa nhập ten";
            request.setAttribute("error", error);
        }
            try {
                if (error.length() == 0) {
                    List<User> acc = UserDAO.GetUsernameAndPhoneAndEmailToCheck();
                    for (int i = 0; i < acc.size(); i++) {
                        if (!(username.equals(acc.get(i).getUserName()) && email.equals(acc.get(i).getEmail()) && phone.equals(acc.get(i).getPhone()))){
                            User user  = new User(username,email,phone,password,name);
                             UserDAO.createUser(user);
                             response.sendRedirect("http://localhost:8080/MXH/FormLogin.jsp");
                        }
                        else{
                            response.sendRedirect("http://localhost:8080/MXH/FormRegistration.jsp");
                        }
                    }
                    
                          
                } else {
                    response.sendRedirect("http://localhost:8080/MXH/FormRegistration.jsp");
                }   
            } catch (Exception e) {
            }
    }    
}
