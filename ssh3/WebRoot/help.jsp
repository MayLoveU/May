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

<title>My JSP 'list.jsp' starting page</title>

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

			<td>妈妈</td>

			<td>爸爸</td>

			<td>年龄</td>

			

		</tr>

		<s:iterator value="#request.help" id="hp">

			<tr>

				<td><s:property value="#hp.id" /></td>

				<td><s:property value="#hp.mom" /></td>

				<td><s:property value="#hp.dad" /></td>

				<td><s:property value="#hp.age" /></td>


			</tr>

		</s:iterator>

	</table>

</body>
</html>
