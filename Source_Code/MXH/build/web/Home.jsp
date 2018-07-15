<%-- 
    Document   : trangchu
    Created on : Mar 19, 2018, 11:01:57 PM
    Author     : TramLuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="main">
            <div class="container">
                <div class="row">
                    <div class="col-md-2 catogory">
                      
                            <div class="row">
                              
                                     <a href="UserPage.jsp" class="btn btn-default btn-xs"><img src="img/tram.jpg" alt="Alternate Text" class="img-responsive" width="190px" height="180px" />
                                    Trâm Lục</a>
                                
                       
                        </div>
                        <hr>
                        <p>
                           Game
                        </p>
                        <a href="rungame/game.jsp"><img src="img/Flappybird-icon.png" width="30px" height="30px"></a>
                    </div>

                    <div class="col-md-8 content">
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

                    <div class="col-md-2">
                        
                        <div class="member_list">
                                <ul class="list-unstyled">
                                    <li class="left clearfix">
                                        <span class="chat-img pull-left">
                                            <img src="img/tram.jpg" alt="User Avatar" class="img-circle">
                                        </span>
                                        <div class="chat-body clearfix">
                                            <div class="header_sec">
                                                <strong class="primary-font">Tram Luc</strong> 
                                            </div>
                                        </div>
                                    </li>
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
                                    
                                    
                                </ul>
                            </div>
                    </div>
                </div>
            </div>

        </div> <!--/main-->
     
    </main><!-- /.container -->

</body>
</html>
