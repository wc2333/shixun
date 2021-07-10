<%@ page import="com.zd.entity.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<%
    List<User> users= (List<User>) request.getAttribute("users");
    if(users!=null){
        for(User user :users){
            out.print(user+"<br/>");
        }
    }
%>


</body>
</html>
