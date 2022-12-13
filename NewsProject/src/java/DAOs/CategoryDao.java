/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.CategoryModel;
import Models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<CategoryModel> GetAll(){
        List<CategoryModel> categories = new ArrayList<>();
        String query = "Select * from Category";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                categories.add(new CategoryModel(rs.getInt(1), rs.getString(2)));
            }
            return categories;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
}
