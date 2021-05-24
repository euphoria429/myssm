<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="users/findUsers">测试查询</a>
<hr>
<form method="post" action="/users/insert">
    用户：<input type="text" name="username"><br>
    密码：<input type="text" name="PASSWORD"><br>
    <input type="submit" value="注册"><br>
</form>
<hr>
<form method="post" action="/users/login">
    用户：<input type="text" name="username"><br>
    密码：<input type="text" name="PASSWORD"><br>
    <input type="submit" value="登录"><br>
</form>
<hr>
<form method="post" action="/users/update">
    用户名：<input type="text" name="username"><br>
    新密码：<input type="text" name="PASSWORD"><br>
    <input type="submit" value="提交"><br>
</form>
<hr>
<form method="post" action="/users/delete">
    请输入要删除的用户id：<input type="text" name="id"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
