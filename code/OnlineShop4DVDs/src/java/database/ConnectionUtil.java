/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jun
 */
public class ConnectionUtil {
        Connection conn = null;
    public Connection getConnection(){
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ShopOnline4DVDs";
            String user= "sa";
            String password = "cuacuacua";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, user, password);
            return c;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
