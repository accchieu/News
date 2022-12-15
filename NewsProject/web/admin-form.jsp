<%-- 
    Document   : admin-home
    Created on : Dec 13, 2022, 10:58:56 PM
    Author     : vuhai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">

    </head>

    <body>
       
        
                        <form action="addnew" method="post">
                                <p>Tên bài viết</p>
                                <input type="text" name="post_title">
                                <p>Danh mục</p>
                                <input type="text" name="post_cate"/>
                                <p>Link ảnh bìa</p>
                                <input type="text" name="post_link">
                                <p>Nội dung bài viết</p>
                                <input type="text" name="descrip"/><br>
                                <input type="button" value="luu">
                        </form>
        
        
            
       
    </body>

</html>