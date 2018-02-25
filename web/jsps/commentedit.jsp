<%--
  Created by IntelliJ IDEA.
  User: zhouhang
  Date: 2017/12/2
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>修改</br>
<FORM id=form1 name=form1
      action="${pageContext.request.contextPath }/test_commentupdate" enctype="multipart/form-data"
      method=post>
    <input type="hidden" name="cid" value="${comment.cid }"/>
    用户名： <INPUT class=textbox name="name" value="${comment.name }"><br>
    评论内容：<INPUT class=textbox name="content" value="${comment.content }"><br>
    <INPUT class=button id=sButton2 type=submit
           value="保存 " name=sButton2>
</FORM>
</body>
</html>
