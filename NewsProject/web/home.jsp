<%-- 
    Document   : home
    Created on : Dec 12, 2022, 5:26:46 PM
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
        <title>GVN360 - Trang chủ</title>
        <link rel="stylesheet" href="./css/style.css">
        <link href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
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
                        <form action="search" method="get">
                            <input type="text" name="header_search" id="">
                            <button>Tìm kiếm</button>
                        </form>
                    </div>
                </div>

                <div class="auth">
                    <a id="header_reg" href="<c:url value="/register"></c:url>">Đăng kí</a>
                    <a id="header_log" href="<c:url value="/login"></c:url>">Đăng nhập</a>
                    </div>

                </div>
                <div class="bottom_header">
                
            </div>
        </header>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="news-wrap">
                        <h4 class="news-update">
                            <hr>
                            <span class="update-title">Mới Cập Nhật</span>
                        </h4>
                        <div class="news-content">
                            <div class="news-list">
                                <c:forEach items="${posts}" var="post">
                                    <div class="news-item_wrap">
                                        <div class="news-item">
                                            <img class="content-img" src="${post.image}" alt="post-1">
                                            <div class="content-des">
                                                <a href="<c:url value="/details?id=${post.id}"></c:url>">${post.title}</a>
                                                    <div class="content-brand_date">
                                                        <a class="content-author" href="">${post.createUser} </a>
                                                    <span>-</span>
                                                    <p class="content-date">${post.createDate}</p>
                                                </div>

                                            </div>
                                        </div>
                                        <hr>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <span class="logo">News</span>
                    </div>

                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <ul class="menu">
                            <span>Menu</span>
                            <li>
                                <a href="#">Home</a>
                            </li>

                            <li>
                                <a href="#">About</a>
                            </li>

                            <li>
                                <a href="#">Blog</a>
                            </li>

                            <li>
                                <a href="#">Gallery</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <ul class="address">
                            <span>Contact</span>
                            <li>
                                <i class="fa fa-phone" aria-hidden="true"></i>
                                <a href="#">Phone: 0123456</a>
                            </li>
                            <li>
                                <i class="fa fa-map-marker" aria-hidden="true"></i>
                                <a href="#">Adress: Quan Ha Dong Thanh Pho Ha Noi</a>
                            </li>
                            <li>
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                                <a href="#">Email: chieu@gmail.com</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
    </body>

</html>