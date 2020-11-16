/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Connec {
    public static java.sql.Connection getConnection(){
        java.sql.Connection con=null;
        String url ="jdbc:mysql://localhost:3306/du_an_1?useSSL=false";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(java.sql.Connection) DriverManager.getConnection(url,"root","minh");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(java.sql.Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(java.sql.Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
