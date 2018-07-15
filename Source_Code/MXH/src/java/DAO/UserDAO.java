/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect_MySQL;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author TramLuc
 */
public class UserDAO {
final static Connection cons = DBConnect_MySQL.getConnecttion();
  
//Tao tai khoan moi
   public static boolean createUser(User user) throws SQLException {
    try {
         String sql = "INSERT INTO database_websocial.User (Username, Name, Password, Phone, Email) VALUE(?,?,?,?,?)";
         PreparedStatement ps = cons.prepareStatement(sql);
  
         ps.setString(1, user.getUserName());
         ps.setString(2,user.getName());
         ps.setString(3,user.getPassword());
         ps.setString(4, user.getPhone());
         ps.setString(5, user.getEmail());
       
         int temp = ps.executeUpdate();
         return temp == 1 ;
    } catch (Exception e) {
         return false;
         
    }
}
   //Lấy Username,phone, email có ton tai chua?
   public static List<User> GetUsernameAndPhoneAndEmailToCheck() throws SQLException {
    
         String sql = "SELECT Username,Phone, Email FROM database_websocial.User ";
        List<User> user = new ArrayList<>();
  try {
      PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
         while(rs.next()){
                User u = new User();
                u.setUserName(rs.getString("Username"));
                u.setPhone(rs.getString("Phone"));
                u.setEmail(rs.getString("Email"));
            }
    } catch (SQLException e) {
        e.printStackTrace();
         
    }
  return user;
}

   //Lay username vs pass 
    public static ArrayList<User> getAcc() {
        String sql = "SELECT Username,Password FROM database_websocial.User" ;
        ArrayList<User> user = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setUserName(rs.getString("Username"));
                System.out.println(u.getUserName());
                u.setPassword(rs.getString("Password"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    
    //Kiem tra phone + email để được reset pass
    public static String getInfoByUsernameToCheck(String username){
        String sql= "SELECT Phone, Email FROM database_websocial.User WHERE Username='"+ username +"'";
        String phone = null, email=null;
        try{
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            phone= rs.getString("Phone");
            email = rs.getString("Email");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return (phone +"/" + email);
    }
    
    public static boolean ResetPass(User user){
         try {
         String sql = "UPDATE database_websocial.User SET Password= ? WHERE Username = ?";
         PreparedStatement ps = cons.prepareCall(sql);
         
         ps.setString(1, user.getPassword());
         ps.setString(2,user.getUserName());

         int temp = ps.executeUpdate();
         return temp == 1 ;
    } catch (Exception e) {
         return false;
    }
    }
    
    public static boolean editUser(User user) throws SQLException {
    try {
         String sql = "UPDATE database_websocial.User SET Name= ? , Password= ?, Phone=?, Email=?, diemtoan=?, diemly=?, diemhoa=?, diemanh=?, diemvan=?, tongdiem=? WHERE id = ?";
         PreparedStatement ps = cons.prepareCall(sql);
         
//         ps.setString(1, c.getMasv());
//         ps.setString(2,c.getHoten());
//         ps.setDate(3,c.getNgaysinh());
//         ps.setString(4,c.getDiachi());
//         ps.setFloat(5, c.getDiemtoan());
//         ps.setFloat(6, c.getDiemly());
//         ps.setFloat(7, c.getDiemhoa());
//         ps.setFloat(8, c.getDiemanh());
//         ps.setFloat(9, c.getDiemvan());
//         ps.setFloat(10,c.getTongdiem());
//         ps.setInt(11, c.getId());
         int temp = ps.executeUpdate();
         return temp == 1 ;
    } catch (Exception e) {
         return false;
    }
}
    
   
   
    
   
}
