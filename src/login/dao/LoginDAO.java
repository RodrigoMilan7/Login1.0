/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package login.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    
    public void userRegist (String name, String email, String password) throws SQLException {
    Connection connect = new Connect().getConnection();
    String sql = "INSERT INTO login (name, email, password) VALUES ('"+name+"','"+email+"','"+password+"')";
    PreparedStatement statment = connect.prepareStatement(sql);
    statment.execute();
    connect.close();
    }
    
    public void login (String email, String password) throws SQLException{
    Connection connect = new Connect().getConnection();
    String sql = "SELECT email,password FROM login WHERE email = '"+email+"' AND password = '"+password+"'";
    PreparedStatement statment = connect.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    if (rs.next()){
    
        System.out.println("POSSUI");
    } else {
    
        System.out.println("NAO POSSUI");
    }
    
    connect.close();
    }
}
