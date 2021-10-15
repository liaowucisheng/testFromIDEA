<%--
  Created by IntelliJ IDEA.
  User: 了无此生
  Date: 2021/10/15/015
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <style type="text/css">
        #registerDiv {
            border: 1px solid;
            border-radius: 20px;
            height: 230px;
            width: 300px;
            /*margin-right:50px;*/
            /*margin-left: 500px;*/
            margin-top: 150px;
        }
    </style>
</head>
<body>
<center>

<div id="registerDiv">
    <form method="post">
        <h1 align="center">欢迎注册</h1>
        <hr/>
        <table align="center">
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"><br/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"><br/></td>
            </tr>
            <tr>
                <td>确认密码：</td>
                <td><input type="password"><br/></td>
            </tr>
        </table>
        <hr/>
        <table align="center">
            <tr>
                <td><input type="reset"> <br/></td>
                <td align="center"><input type="submit"></td>
            </tr>
        </table>


    </form>
</div>
</center>

</body>
</html>
