<%-- 
    Document   : java8-1
    Created on : 2018/06/14, 12:54:41
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int se = 1000;
    
    while(se>100){
        se = se/2;
    }
    
    out.print(se);
%>
