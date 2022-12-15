/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.CategoryModel;
import Models.NewsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsPostDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<NewsModel> getAll() {
        List<NewsModel> categories = new ArrayList<>();
        String query = "Select * from News order by create_date desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                categories.add(new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate()));
            }
            return categories;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public List<NewsModel> getByCateId(int cateId) {
        List<NewsModel> categories = new ArrayList<>();
        String query = "select * from News where cate_id = ? order by create_date desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cateId);
            rs = ps.executeQuery();

            while (rs.next()) {
                categories.add(new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate()));
            }
            return categories;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public List<NewsModel> search(String searchValue) {
        List<NewsModel> categories = new ArrayList<>();
        String query = "select * from News where title like '%" + searchValue + "%' order by create_date desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                categories.add(new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate()));
            }
            return categories;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public NewsModel getDetails(int id) {
        String query = "select * from News where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                return new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate());
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public boolean deleteNews(int id) {

        String query = "delete from News where id = ?";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;

    }

    public List<NewsModel> getUserNews(String create_user) {
        List<NewsModel> cuser = new ArrayList<>();
        String query = "select * from News where create_user = ?";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, create_user);
            rs = ps.executeQuery();
            while (rs.next()) {
                NewsModel nm = new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate());
                cuser.add(nm);

            }
            return cuser;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    

    public boolean updateCategory(CategoryModel cate) {
        String query = "insert into Category values(?) ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cate.getCategoryName());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    
    public boolean addNews(NewsModel news) {
        String query = "insert into News(\n"
                + "cate_id,title,[description],[image],create_date,create_user,update_date\n"
                + ") values(?,?,?,?,Getdate(),?,Getdate())";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, news.getCateId());
            ps.setString(2, news.getTitle());
            ps.setString(3, news.getDescription());
            ps.setString(4, news.getImage());
            ps.setString(5, news.getCreateUser());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;

    }
    
    

//    public static void main(String[] args) {
//        NewsPostDao npd = new NewsPostDao();
//        CategoryModel cm = new CategoryModel(0, "chieu");
//
//        boolean check = npd.updateCategory(cm);
//        System.out.println(check);
//    }
//    public static void main(String[] args) {
//        NewsPostDao npd = new NewsPostDao();
//        List<NewsModel> cuser = new ArrayList<>();
//
//        cuser = npd.getUserNews("admin");
//        for (NewsModel newsModel : cuser) {
//            System.out.println(newsModel.getCreateUser());
//        }
//    }
//    public static void main(String[] args) {
//        NewsPostDao npd = new NewsPostDao();
//        NewsModel news =new NewsModel(0, 1, "chie", "efv", "bwjf", LocalDate.MAX, "admin", LocalDate.MAX);
//        
//        boolean check  = npd.addNews(news);
//        System.out.println(check);
//    }
}
