<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


</head>

<body>


	<table border="1" width="80%" align="center">

		<tr>

			<td>序号</td>

			<td>姓</td>

			<td>名</td>

			<td>年龄</td>

			

		</tr>

		<s:iterator value="#request.user" id="us">

			<tr>

				<td><s:property value="#us.id" /></td>

				<td><s:a href="listHelp.action"><s:property value="#us.lastname" /></s:a></td>

				<td><s:property value="#us.firstname" /></td>

				<td><s:property value="#us.age" /></td>


			</tr>

		</s:iterator>

	</table>

</body>
</html>
