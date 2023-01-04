/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Home;

import DAOs.NewsPostDao;
import Models.NewsModel;
import Models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author vuhai
 */
public class AddNews extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        UserModel user = (UserModel) session.getAttribute("acc");

        String title = req.getParameter("post_title");
        String image = req.getParameter("post_link");
        String description = req.getParameter("descrip");
        String cateIdRaw = req.getParameter("post_cate");
        try {
            int cateId = Integer.parseInt(cateIdRaw);
            NewsPostDao newsPostDao = new NewsPostDao();
            NewsModel news = new NewsModel(0, cateId, title, description, image, LocalDate.MAX, user.getUsername(), LocalDate.MAX);
            newsPostDao.addNews(news);
        } catch (Exception e) {
            System.out.println("errror" + e);
        }

        resp.sendRedirect("home");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        req.getRequestDispatcher("admin-form.jsp").forward(req, resp);
    }
    
}
