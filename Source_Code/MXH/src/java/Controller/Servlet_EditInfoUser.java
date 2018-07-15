/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TramLuc
 */
public class Servlet_EditInfoUser extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
  }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String othername = request.getParameter("othername");
        String address = request.getParameter("address"); 
        String hometown = request.getParameter("hometown");
        String describe = request.getParameter("describe");
        String hobby = request.getParameter("hobby");
        // + hình avatar
        
        String error = "";
        if (name.equals("")) {
            error = "Chưa nhập tên";
            request.setAttribute("error", error);
           
        }
            try {
                if (error.length() == 0) {
//                            Date ngaysinh = Date.valueOf(ngaysinh1);
//                            float toan = Float.parseFloat(toan1);
//                            float ly = Float.parseFloat(ly1);
//                            float hoa = Float.parseFloat(hoa1);
//                            float anh = Float.parseFloat(anh1);
//                            float van = Float.parseFloat(van1);
//                            sinhvien sv = new sinhvien(0, masv, hoten, ngaysinh, cumthi, toan, ly, hoa, anh, van);
//                            sinhvienDAO.insert(sv);
                            response.sendRedirect("http://localhost:8080/MXH/thongtincanhan.jsp");
                } else {
                    response.sendRedirect("http://localhost:8080/MXH/thongtincanhan.jsp");
                }   
            } catch (Exception e) {
            }
    }    
}
