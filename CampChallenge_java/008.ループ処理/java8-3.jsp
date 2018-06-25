<%-- 
    Document   : java8-1
    Created on : 2018/06/14, 12:54:41
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int go = 0;
    
for(int i=1;i<=100;i++){
    go += i;
}
    
    out.print(go);
%>
