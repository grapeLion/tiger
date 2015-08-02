<%@ page isELIgnored="false" language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path",path);
%>
<html>
    <title>我的练习网站</title>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/metro/easyui.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/icon.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/color.css"/>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${path}/static/index/index.js"></script>



</head>
<body>

<h2>Hello World! ${user.username} ${path}</h2>
<div id="pp" data-options="href='operator/index.html?id=1'"></div>
<div id="dd"></div>
<a href="#" onclick="javascript:$('#pp').panel('open')">Open</a>


</body>
</html>