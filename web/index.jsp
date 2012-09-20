<%-- 
    Document   : index
    Created on : Sep 5, 2012, 11:22:11 AM
    Author     : JokermanBuilt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>David Pruszka's Computer Store</title>
        <style>
            tr, th{
                text-align:center;
            }
        </style>
    </head>
    <body>
        
        <form method="POST" action ="Servlet2">
            
            <table width="40%" border="1" align="center">
                <tr>
                    <th>CPU Type</th>
                </tr>
                <tr>
                    <td><input type="radio" name="cpu" value="3770" /> 3770K i7 Intel Processor</td>
                </tr>
                <tr>
                    <td><input type="radio" name="cpu" value="3000" /> 3000k i7 Intel Processor</td>
                </tr>
                <tr>
                    <td> </td>
                </tr>
                <tr>
                    <th>Memory Size</th>
                </tr>
                <tr>
                    <td><input type="radio" name="ram" value="1x2" /> 2GB (1 x 2GB)</td>
                </tr>
                <tr>
                    <td><input type="radio" name="ram" value="2x2" /> 4GB (2 x 2GB)</td>
                </tr>
                <tr>
                    <td><input type="radio" name="ram" value="2x3" /> 6GB (2 x 3GB)</td>
                </tr>
                <tr>
                    <td><input type="radio" name="ram" value="4x2" /> 8GB (4 x 2GB)</td>
                </tr>
                <tr>
                    <td><input type="radio" name="ram" value="4x4" /> 16GB (4 x 4GB)</td>
                </tr>
                <tr>
                    <td> </td>
                </tr>
                <tr>
                    <th>Hard Drive Space</th>
                </tr>
                <tr>
                    <td><input type="radio" name="hdd" value="250" /> 250GB</td>
                </tr>
                <tr>
                    <td><input type="radio" name="hdd" value="500" /> 500GB</td>
                </tr>
                <tr>
                    <td><input type="radio" name="hdd" value="1000" /> 1TB</td>
                </tr>
                <tr>
                    <td><input type="radio" name="hdd" value="2000" /> 2TB</td>
                </tr>
            </table>
            
            <hr />
            <table>
                <tr>
                    <th>Enter Your Name:</th>
                    <td><input type="text" name="name" value="Name" /></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Submit" name="submit" />
            
        </form>
        
    </body>
</html>
