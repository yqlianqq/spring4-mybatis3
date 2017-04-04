<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>显示员工信息</title>
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>员工工号</td>
                <td>用户密码</td>
                <td>用户名称</td>
                <td>科室编号</td>
            </tr>
            <%--遍历lstUsers集合中的User对象 --%>
            <c:forEach var="employee" items="${lstEmployees}">
                <tr>
                    <td>${employee.empId}</td>
                    <td>${employee.empPwd}</td>
                    <td>${employee.empName}</td>
                    <td>${employee.empOffid}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>