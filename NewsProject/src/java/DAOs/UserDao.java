/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public UserModel LoginDao(String userName, String password){
        String query = "";
        return null;
    }
}
