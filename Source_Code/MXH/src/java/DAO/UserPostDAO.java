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
import java.sql.SQLException;

/**
 *
 * @author TramLuc
 */
public class UserPostDAO {
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
}
