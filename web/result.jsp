<%-- 
    Document   : result
    Created on : Sep 5, 2012, 11:28:40 AM
    Author     : JokermanBuilt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>David Pruszka's Computer Store</title>
    </head>
    <body>
        <p>Are you sure you want to order:</p>
        <p><% request.getAttribute("cpu").toString();%></p>
        <p><% request.getAttribute("ram").toString();%></p>
        <p><% request.getAttribute("hdd").toString();%></p>
    </body>
</html>
