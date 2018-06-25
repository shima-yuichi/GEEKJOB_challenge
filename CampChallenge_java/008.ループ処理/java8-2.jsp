<%-- 
    Document   : java8-1
    Created on : 2018/06/14, 12:54:41
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String len = "";
    String pl ="A";
    
for(int i=0;i<30;i++){
    len += pl;
}
    
    out.print(len);
%>
