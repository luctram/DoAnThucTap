/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import org.json.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import static javafx.css.StyleOrigin.USER_AGENT;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author TramLuc
 */
public class DBConnect_MySQL {
public static Connection getConnecttion() {
        Connection cons = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_websocial", "lkmt", "root");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        return cons;
    }

 
}
