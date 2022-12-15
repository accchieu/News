<%-- 
    Document   : admin-home
    Created on : Dec 12, 2022, 10:58:56 PM
    Author     : vuhai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GVN360</title>
        <link href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <script src="./js/admin.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="./css/details.css">
        <link rel="stylesheet" href="./css/footer.css">
        <link rel="stylesheet" href="./css/header.css">
    </head>

    <body>
        <header>
            <div class="top_header">
                <div class="logo">
                    <a href="#">
                        <h6>News</h6>
                    </a>
                </div>
                <div class="search">
                    <div class="wrapper">
                        <form action="" method="get">
                            <input type="text" name="header_search" id="">
                            <button>Tìm kiếm</button>
                        </form>
                    </div>
                </div>
                <div class="auth">
                    <a id="header_reg" href="#">Đăng kí</a>
                    <a id="header_log" href="#">Đăng nhập</a>
                </div>
            </div>
        </header>
        <a href="<c:url value="admin-form.jsp"></c:url>">Thêm bài viết mới</a><br>
    </body>
    
</html>