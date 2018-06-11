<%-- 
    Document   : java3-1
    Created on : 2018/06/11, 16:53:55
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    final int tei = 17;
    int hen = 17;
    
    int tasu = tei+hen;
    out.print("足し算の結果は"+tasu+"<br>");
    
    int hiku = tei-hen;
    out.print("引き算の結果は"+hiku+"<br>");
    
    int kake = tei*hen;
    out.print("掛け算の結果は"+kake+"<br>");
    
    int waru = tei/hen;
    out.print("割り算の結果は"+waru+"<br>");
    
    int ama = tei%4;
    out.print("定数を４で割った余りは"+ama+"<br>");
%>