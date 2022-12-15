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

    

    public UserModel login(String username, String pass) {
        String query = "Select * from [User] where username = ? and [password] = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
            }
        } catch (Exception e) {
            System.out.println("Connection error! " + e);
        }
        return null;
    }

    public boolean getRole(String username) {
        String query = "Select role from [User] where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setBoolean(1, true);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getBoolean(1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    public boolean findUserByUsername(String userName) {
        String query = "select * from [User] where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    public boolean registerUser(UserModel user) {
        String query = "Insert into [User](first_name, last_name, email, username, password)"
                + "values(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user.getFirst_name());
            ps.setString(2, user.getLast_name());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getUsername());
            ps.setString(5, user.getPassword());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean checkAccount(String email, String username) {
        String query = "Select * from [User] where email = ? and [username] = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("check error! " + e);
        }
        return false;
    }
    
    public void updatePass(String username, String newpass) {
        try {
            String strupdate="update [User] set [password]=? "
                    + "where account=?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(strupdate);
            ps.setString(1, newpass);
            ps.setString(2, username);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("updatePass fail:"+e.getMessage());
        }
    }


}


//protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String email = request.getParameter("email");
//        String username = request.getParameter("username");
//        UserDao u = new UserDao();
//        if (u.checkAccount(email, username)) {
//
//            String newpass = getAlphaNumericString(10);
//            u.updatePass(username, newpass);
//
//            request.setAttribute("newpass", newpass);
//        }
//        request.setAttribute("email", email);
//        request.setAttribute("username", username);
//
//        request.getRequestDispatcher("resetPass.jsp").forward(request, response);
//
//    }