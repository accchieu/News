/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import static Helpers.DateHelper.convertLocalDateToSqlDate;
import Models.NewsModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NewsPostDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<NewsModel> GetAll() {
        List<NewsModel> categories = new ArrayList<>();
        String query = "Select * from News";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                categories.add(new NewsModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getDate(8).toLocalDate()));
            }
            return categories;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
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

    public static void main(String[] args) {
        NewsPostDao npd = new NewsPostDao();
        List<NewsModel> cuser = new ArrayList<>();

        cuser = npd.getUserNews("admin");
        for (NewsModel newsModel : cuser) {
            System.out.println(newsModel.getCreateUser());
        }
    }

//    public static void main(String[] args) {
//        NewsPostDao npd = new NewsPostDao();
//        NewsModel news =new NewsModel(0, 1, "Test", "test", "test", LocalDate.MAX, "chieu", LocalDate.MAX);
//        
//        boolean check  = npd.addNews(news);
//        System.out.println(check);
//    }
}
