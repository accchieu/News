<%-- 
    Document   : login
    Created on : Dec 6, 2022, 10:30:28 PM
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
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="./css/login.css">

    <title>GVN360</title>
</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-login">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-6">
                                <a href="#" class="active" id="login-form-link">Đăng nhập</a>
                            </div>
                            <div class="col-xs-6">
                                <a href="#" id="register-form-link">Đăng kí</a>
                            </div>
                        </div>
                        <hr>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form id="login-form" action="login" method="post"
                                    role="form" style="display: block;">
                                    <div class="form-group">
                                        <input type="text" name="log_username" id="username" tabindex="1"
                                            class="form-control" placeholder="Tên đăng nhập" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="log_password" id="password" tabindex="2"
                                            class="form-control" placeholder="Mật khẩu">
                                    </div>
                                    <div class="form-group">
                                        <c:if test="${errMsg != null}">
                                            <p>${errMsg}</p>
                                        </c:if>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-6 col-sm-offset-3">
                                                <input type="submit" name="login-submit" id="login-submit" tabindex="4"
                                                    class="form-control btn btn-login" value="Đăng nhập">
                                            </div>
                                        </div>
                                    </div>

                                </form>
                                <form id="register-form" action="register" method="post"
                                    role="form" style="display: none;">
                                    <div class="form-group">
                                        <input type="text" name="reg_firstname" id="username" tabindex="1"
                                            class="form-control" placeholder="Họ và tên đệm" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="reg_lastname" id="username" tabindex="1"
                                            class="form-control" placeholder="Tên" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="reg_username" id="username" tabindex="1"
                                            class="form-control" placeholder="Tên đăng nhập" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" name="reg_email" id="email" tabindex="1" class="form-control"
                                            placeholder="Email" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="reg_password" id="password" tabindex="2"
                                            class="form-control" placeholder="Mật khẩu">
                                    </div>
                                    <div class="form-group">
                                        <c:if test="${regError != null}">
                                            <p>${regError}</p>
                                        </c:if>
                                    </div>
                                    <!-- <p>Sai tk mk</p> -->
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-6 col-sm-offset-3">
                                                <input type="submit" name="register-submit" id="register-submit"
                                                    tabindex="4" class="form-control btn btn-register"
                                                    value="Đăng kí">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script src="./js/login.js"></script>

</html>
