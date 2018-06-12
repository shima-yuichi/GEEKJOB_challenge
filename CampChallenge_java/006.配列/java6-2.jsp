<%-- 
    Document   : java6-1
    Created on : 2018/06/12, 14:54:48
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<%
    ArrayList<String> data1 = new ArrayList<String>();
    data1.add("10");
    data1.add("100");
    data1.add("soeda");
    data1.add("hayashi");
    data1.add("-20");
    data1.add("118");
    data1.add("END");
    
    data1.set(2,"33");
    
    out.print(data1.get(0)+"<br>");
    out.print(data1.get(1)+"<br>");
    out.print(data1.get(2)+"<br>");
    out.print(data1.get(3)+"<br>");
    out.print(data1.get(4)+"<br>");
    out.print(data1.get(5)+"<br>");
    out.print(data1.get(6)+"<br>");
       
%>