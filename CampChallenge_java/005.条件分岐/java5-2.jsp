<%-- 
    Document   : 5-2
    Created on : 2018/06/12, 11:56:02
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int bunki =1;
    
    switch(bunki){
        case 1:
            out.print("one");
            break;
        case 2:
            out.print("two");
            break;
        default:
            out.print("想定外");
            break;
    }




%>
