<%-- 
    Document   : trangcanhan
    Created on : Jun 27, 2018, 11:33:54 PM
    Author     : TramLuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MAKEFRIEND SOCIAL NETWORK</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css.css">
        <jsp:include page="menu.jsp"></jsp:include>
        <jsp:include page = "footer.jsp"></jsp:include>
    </head>
    <body>
            <%
            User user= new User();
            user.setName("Trâm Lục");
            user.setOtherName("ahihi");
        %>
        <div class="container-fluid">
            <div class="row">
                <div class="fb-profile">
                    <img align="left" class="profile-img thumbnail" src="img/tram.jpg" alt="Profile image example"/>
                    <div class="profile-name">
                        <h1><%=user.getName()%>
                            <% if(!user.getOtherName().equals("")) // Kiem tra user có dùng othername ko
                                %>&nbsp;(<%=user.getOtherName()%>)
                            
                            </h1>
                    </div>
                    
                    <div class="describe">
                        <div data-spy="scroll" class="tabbable-panel">
                            <%=user.getDescribe()%>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- /container fluid-->  
        <div class="container">
            <div class="col-sm-8">
                <div data-spy="scroll" class="tabbable-panel">
                    <div class="tabbable-line">
                        <ul class="nav nav-tabs ">
                            <li class="active">
                                <a href="#tab_default_1" data-toggle="tab">
                                    Bài đăng</a>
                            </li>
                            <li>
                                <a href="#tab_default_2" data-toggle="tab">
                                    Tạo bài đăng mới</a>
                            </li>
                            <li>
                                <a href="#tab_default_3" data-toggle="tab">
                                    Bạn bè</a>
                            </li>
                            <li>
                                <a href="#tab_default_4" data-toggle="tab">
                                    Ảnh & video</a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_default_1">
                                <div class="panel panel-default">
                                    <div class="panel-heading">Panel Heading</div>
                                    <div class="panel-body">Panel Content</div>
                                    <div class="panel-footer">
                                        <p>
                                            <img src="/open-iconic/svg/comment-square.svg">
                                        </p>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">Panel Heading</div>
                                    <div class="panel-body">Panel Content</div>
                                    <div class="panel-footer">
                                        <p>
                                            <img src="/open-iconic/svg/comment-square.svg">
                                        </p>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">Panel Heading</div>
                                    <div class="panel-body">Panel Content</div>
                                    <div class="panel-footer">
                                        <p>
                                            <img src="/open-iconic/svg/comment-square.svg">
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_default_2">
                                <div class="panel panel-default">
                                    <div class="panel-heading">Panel Heading</div>
                                    <div class="panel-body">Panel Content</div>
                                    <div class="panel-footer">
                                        <p>
                                            <img src="/open-iconic/svg/comment-square.svg">
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="tab_default_3">

                                <div class="row">
                                    <div class="member_list">
                                        <ul class="list-unstyled">
                                            <div class="col-sm-4">
                                                <li class="left clearfix">
                                                    <span class="chat-img pull-left">
                                                        <img src="img/tram.jpg" alt="User Avatar" class="img-circle">
                                                    </span>
                                                    <div class="chat-body clearfix">
                                                        <div class="header_sec">
                                                            <strong class="primary-font">Tram Luc</strong> 
                                                        </div>
                                                    </div>
                                                    <span class="pull-right">Hủy kêt bạn icon</span>
                                                </li>
                                            </div>
                                            <div class="col-sm-4">
                                                <li class="left clearfix">
                                                    <span class="chat-img pull-left">
                                                        <img src="img/fulllogo.jpg" alt="User Avatar" class="img-circle">
                                                    </span>
                                                    <div class="chat-body clearfix">
                                                        <div class="header_sec">
                                                            <strong class="primary-font">Bao Cuong</strong> 
                                                        </div>
                                                    </div>
                                                </li>
                                            </div>
                                            <div class="col-sm-4">
                                                <li class="left clearfix">
                                                    <span class="chat-img pull-left">
                                                        <img src="img/logo.jpg" alt="User Avatar" class="img-circle">
                                                    </span>
                                                    <div class="chat-body clearfix">
                                                        <div class="header_sec">
                                                            <strong class="primary-font">Tram tram</strong> 
                                                        </div>
                                                    </div>
                                                </li>
                                            </div>
                                    </div>
                                    </ul>
                                </div>
                            </div>
                      
                        <div class="tab-pane" id="tab_default_4">
                            <div class="row">
                            <div class="gallery">
                                <div class="col-sm-3">
                                    <img src="img/fulllogo.jpg" alt="">
                                </div>
                                <div class="col-sm-3">
                                    <img src="img/fulllogo.jpg" alt="">
                                </div>
                                <div class="col-sm-3">
                                    <img src="img/fulllogo.jpg" alt=""><img src="img/fulllogo.jpg" alt="">
                                </div>
                                 <div class="col-sm-3">
                                    <img src="img/fulllogo.jpg" alt=""><img src="img/fulllogo.jpg" alt="">
                                </div>
                            </div>
                            </div>
                            </div>
                          
                        </div>
                    </div>
                </div>
            </div>
        
        <div class="col-sm-4">
            <div class="panel panel-default">
                <div class="menu_title">
                    THÔNG TIN CÁ NHÂN
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="form-group">
                                <i class="fa fa-birthday-cake"></i>&nbsp;<label for="email">Sinh nhật&nbsp;</label><%=user.getBDay()%>
                            </div>
                            <div class="form-group">
                                <i class="fa fa-map-marker"></i>&nbsp; <label for="email">Đến từ&nbsp;</label><%=user.getHometown()%>
                            </div>
                            <div class="form-group">
                                <i class="fa fa-home"></i>&nbsp;<label for="email">Sống tại&nbsp;</label><%=user.getAddress()%>

                            </div>
                            <div class="form-group">
                                <i class="fa fa-phone"></i> &nbsp; <label for="email">Số điện thoại&nbsp;</label><%=user.getPhone()%>
                            </div>
                            <div class="form-group">
                                <i class="fa fa-envelope"></i> &nbsp;   <label for="email">Email&nbsp;</label><%=user.getEmail()%>

                            </div>
                            <div class="form-group">
                                <i class="fa fa-envelope"></i> &nbsp;   <label for="email">Sở thích&nbsp;</label><%=user.getHobby()%>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
