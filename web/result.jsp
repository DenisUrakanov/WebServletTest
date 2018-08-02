<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 02.08.2018
  Time: 0:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Players</title>
</head>
<body>
<br><br>
<%
    response.getWriter().print("Players from JSP");
    List styles = (List) request.getAttribute("resultView");
    Iterator it = styles.iterator();
    String resultThoughts = (String) request.getAttribute("resultThoughts");
    while (it.hasNext()){
        response.getWriter().print("<br>player: "+ it.next());
    }

    response.getWriter().print("<br>And you know," + resultThoughts);
%>
</body>
</html>