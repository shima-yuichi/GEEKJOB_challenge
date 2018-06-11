<%-- 
    Document   : challenge1-1
    Created on : 2018/06/08, 16:46:40
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name = "私の名前は島雄一です。<br>";
    String add = "よろしくお願いいたします。";
    name += add;
    out.print(name);
%>