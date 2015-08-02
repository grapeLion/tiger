<%@ page isELIgnored="false" language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path",path);
%>
<html>
<head>
    <title>我的练习网站</title>




</head>
<body>

<h2>Hello World! ${user.username} ${path}</h2>
</body>
</html>