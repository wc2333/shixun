<%--
  Created by IntelliJ IDEA.
  User: wang sir
  Date: 2021/7/6
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>$Title$</title>
</head>
<body>
用户信息：<br/>
用户id:${user.uid}<br/>
用户名:${user.username}<br/>
用户密码:${user.password}<br/>
用户性别:${user.gender}<br/>
用户电话:${user.phone}<br/>
</body>
</html>
