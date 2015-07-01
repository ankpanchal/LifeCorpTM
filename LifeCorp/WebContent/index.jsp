<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Life Corp TM</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    
<h1>Product list</h1>
<table>
    <tr>
        <th>Product Name</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>
    <tr>
        <td>Widgets</td>
        <td class="right">$5</td>
        <td><form action="CartServlet" method="post">
            <input type="hidden" name="productName" value="8601">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td>Gizmos</td>
        <td class="right">$3</td>
        <td><form action="CartServlet" method="post">
                <input type="hidden" name="productName" value="pf01">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td>DooHickeys</td>
        <td class="right">$3.25</td>
        <td><form action="CartServlet" method="post">
                <input type="hidden" name="productName" value="pf02">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td>Gadgets</td>
        <td class="right">$4.03</td>
        <td><form action="CartServlet" method="post">
                <input type="hidden" name="productName" value="jr01">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
</table>
        
</body>
</html>