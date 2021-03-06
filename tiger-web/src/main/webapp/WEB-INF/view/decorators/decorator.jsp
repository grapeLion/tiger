<%--
  Created by IntelliJ IDEA.
  User: Emily
  Date: 15/8/2
  Time: 下午9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/metro/easyui.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/icon.css"/>
    <link type="text/css" rel="stylesheet" href="${path}/static/jquery-easyui-1.4.3/themes/color.css"/>
    <script type="text/javascript" src="${path}/static/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
  <sitemesh:write property='head'/>
  <style type='text/css'>
    .mainBody {
      padding: 10px;
      border: 1px solid #555555;
    }
    .conbgbtm {
      width:100%;
      min-height:400px;
      height:auto;
      overflow:hidden;
      zoom:1;
    }
  </style>
</head>
<body>
    <!--头部  -->
    <div align="center">
      <h1 >头部信息：
        <sitemesh:write property='title' />
      </h1>
    </div>
    <hr>

    <!--主体内容  -->
    <div class="conbgbtm">
      <sitemesh:write property='body'></sitemesh:write>
    </div>
    <hr>

    <!--底部  -->
    <div align="center">
      <span>Copyright © 2012-2013 廊坊信息技术提高班 版权所有</span>
        <sitemesh:write property='body'></sitemesh:write>
    </div>
</body>
</html>
