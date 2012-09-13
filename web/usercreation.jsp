<%-- 
    Document   : usercreation
    Created on : Sep 12, 2012, 8:20:56 PM
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
        <form id="userForm" name="userForm" method="POST" action="UserController">
            <table width="40%" border="0" align="center">
                <tr>
                    <th colspan="4">Name</th>
                </tr>
                <tr>
                    <td width="25%" align="right">First</td>
                    <td width="25%"><input type="text" name="firstname" /></td>
                    <td width="25%" align="right">Last</td>
                    <td width="25%"><input type="text" name="lastname" /></td>
                </tr>
                <tr>
                    <th colspan="2" align="right">Email (This serves as your login name)</th>
                    <td colspan="2"><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <th colspan="4">Address (optional)</th>
                </tr>
                <tr>
                    <td colspan="2" align="right">Street</td>
                    <td colspan="2"><input type="text" name="street" /></td>
                </tr>
                 <tr>
                    <td colspan="2" align="right">City</td>
                    <td colspan="2"><input type="text" name="city" /></td>
                </tr>   
                <tr>
                    <td colspan="2" align="right">State</td>
                    <td colspan="2"><input type="text" name="state" /></td>
                </tr> 
                <tr>
                    <td colspan="2" align="right">Zip Code</td>
                    <td colspan="2"><input type="text" name="zip" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="right">Phone Number (optional)</td>
                    <td colspan="2"><input type="text" name="pnumber" /></td>
                </tr>
                <tr>
                    <th colspan="4">
                        Password
                    </th>
                </tr>
                <tr>
                    <td colspan="2" align="right">Enter Password</td>
                    <td colspan="2"><input type="text" name="pwd" /></td>
                </tr>
                <tr>
                    <th colspan="4"><input type="submit" value="Submit" /></th>
                </tr>
                <tr>
                    <th style="font-color:red; font-size:30px;"><% out.print(request.getAttribute("info")); %></th>
                </tr>
            </table>
        </form>
    </body>
</html>
