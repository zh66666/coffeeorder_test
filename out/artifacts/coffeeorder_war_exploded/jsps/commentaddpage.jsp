<%--
  Created by IntelliJ IDEA.
  User: zhouhang
  Date: 2017/11/30
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>添加一条评论</br>
<FORM id=form1 name=form1
      action="${pageContext.request.contextPath }/test_commentadd" enctype="multipart/form-data"
      method=post>
    用户名： <INPUT class=textbox name="name"><br>
    评论内容：<INPUT class=textbox name="content"><br>
    <INPUT class=button id=sButton2 type=submit
           value="保存 " name=sButton2>
</FORM>

</body>
</html>
