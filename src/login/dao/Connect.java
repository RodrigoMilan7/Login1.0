/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.dao;

import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
     public Connection getConnection() throws SQLException {
         Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/App", 
                 "postgres", "123456a");
        return connect; 
    }
}
