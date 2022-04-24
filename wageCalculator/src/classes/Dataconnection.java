package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Barry Sinemaue
 */
public class Dataconnection {
    static Connection c;
    
    public static Connection getCon() throws Exception {
        if(c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3030/wagecal","root","");
        }
        return c;
    }
    
    public static void wageInput(String sql) throws Exception {
        getCon().createStatement().executeUpdate(sql);
    }
}
