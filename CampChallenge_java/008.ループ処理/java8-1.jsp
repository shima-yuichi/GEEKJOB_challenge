<%-- 
    Document   : java8-1
    Created on : 2018/06/14, 12:54:41
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    long se = 1;
    
for(int i=0;i<20;i++){
    se = se*8;
}
    
    out.print(se);
%>
