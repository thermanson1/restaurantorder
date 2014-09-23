<%--
    Document   : menuPage
    Created on : Sep 15, 2014, 8:15:51 PM
    Author     : Teraesa
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Object obj = request.getAttribute("menuItems");
    if(obj == null){
    response.sendRedirect("MainController?action=getOriginalList");
    %>
<html>
    <head>
        <title>Order Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <link href="bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css"/>


        <script src="bootstrap.min.js" type="text/javascript"></script>
        
    </head>
    <body>
        <nav class="navbar navbar-default navbar-static-top">
            <div class="containter">
                <div class="navbar-header">
                    <a href="#" class="navbar-brand">Rae's Place</a>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#collapse-menu">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="containter">
                    <div class="jumbotron">
                        <h1>Order Page</h1>
                        <p>Please make your selection from the following menu choices: </p>
                    </div>
                </div>
                        <div class="container">
                            <div class="row">
                                
                                    <h3>Menu</h3>
                                    <form name="menuForm" id="menuForm" method="POST" action="submitOrder">
                                <%
  /*      
                                        <%
                                            List<MenuItem> items = new ArrayList<MenuItem>();
                                            
                                            if(obj!= null){
                                                items= (List<MenuItem>) obj;
                                            }
                                            for(MenuItem item : items){
                                                out.println("<input type='checkbox' name='menuItemSelected' value='" + item.getName() + ", " + item.getPrice() + "'>"
                                                + item.getName() + ", " + item.getPrice() + "<br>");
                                            }
          */
                                            %> 
                                 
     
                                                <c:forEach var="item" items="$(menuItems)" varStatus="rowCount">
                                                <input type="checkbox" value="$(item.name), $(item.price)">$(item.name), $(item.price)> "<br>"
                                            </c:forEach>
                                        
                                    </form>
                                </div>
                            </div>
                            <p></p>
                            <button class="btn btn-info">Submit Order</button>
                        </div>
                    </div>

        </nav> 
        <nav class="navbar navbar-inverse navbar-fixed-bottom">
            <div class="containter">
                <p class="navbar-text"><i>&copy; 2014 Teraesa Hermanson</i></p>
            </div>
        </nav>
       
        
    </body>
</html>
