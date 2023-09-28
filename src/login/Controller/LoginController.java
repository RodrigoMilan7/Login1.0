/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.Controller;

import java.sql.SQLException;
import java.sql.Connection;
import login.dao.Connect;
import login.dao.LoginDAO;
import login.view.CreatAccView;
import login.view.LoginView;

/**
 *
 * @author teste
 */
public class LoginController {
    
    public void newRegistUser(CreatAccView view) throws SQLException {
        Connection connect = new Connect().getConnection();
        LoginDAO register = new LoginDAO();
        register.userRegist(view.getjTextFieldName().getText(), 
                view.getjTextFieldEmail().getText(), view.getjPasswordFieldPassword().getText());
    }
   
    public void userLogin(LoginView view) throws SQLException {
        Connection connect = new Connect().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldPassword().getText());
    }
}
