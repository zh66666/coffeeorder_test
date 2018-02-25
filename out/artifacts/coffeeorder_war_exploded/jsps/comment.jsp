<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhouhang
  Date: 2017/11/29
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论测试</title>
</head>
<br>
<br>评论测试</br>




<div>

</div>
<table border="8" cellspacing="10">
    <thead>
    <tr>
        <th>用户</th>
        <th>评论</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${commentList}" var="comment">
        <tr>
            <td>    ${comment.name } </td>

            <td> ${comment.content }</td>
            <td><a href="${pageContext.request.contextPath}/test_commentdelete?cid=${comment.cid}">删除</a></td>
            <td><a href="${pageContext.request.contextPath}/test_commentedit?cid=${comment.cid}">修改</a></td>
        </tr>




    </c:forEach>

 </tbody>
</table>


<div>
    <a href="${pageContext.request.contextPath}/test_tocommentaddpage">添加评论</a>
</div>
</body>
</html>