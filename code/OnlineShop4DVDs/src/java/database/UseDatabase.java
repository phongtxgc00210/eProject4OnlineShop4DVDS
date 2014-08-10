/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import entities.Product;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jun
 */
public class UseDatabase {
    
    private ConnectionUtil cu;
    
    public UseDatabase() {
        this.cu = new ConnectionUtil();
    }

    // <editor-fold defaultstate="collapsed" desc="Products">
    public List<Product> getAllProduct() {
        List<Product> l = new ArrayList<>();
        try {
            Connection conn = cu.getConnection();
            CallableStatement csmt = conn.prepareCall("Select * from Roles");
            ResultSet rs = csmt.executeQuery();
            while (rs.next()) {
                long productID = rs.getLong("ProductID");
                String productName = rs.getString("ProductName");
                Double productPrice = rs.getDouble("ProductPrice");
                Date productReleaseDate = rs.getDate("ProductReleaseDate");
                String productAvatar = rs.getString("ProductAvatar");
                String productURL = rs.getString("ProductURL");
                String productDesc = rs.getString("ProductDesc");
                
                Product p = new Product(productID, productName, productPrice, productReleaseDate, productAvatar, productURL, productDesc);
                l.add(p);
            }
            rs.close();
            csmt.close();
            conn.close();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // </editor-fold>
    
    
}
