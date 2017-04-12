<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<style>
	label {
		font-family: Times new roman;
		color: skyblue;
		font-size: 200%;
	}
	table, th, td {
		border: 1px solid #000000;
		border-collapse: collapse;
	}
	body{
		text-align: center;
	}
</style>

<body>
<img src="/resources/images/banner.png" style="width:1000px;height:400px;">
<form:form commandName="search" method="post" action="/Information">
	</br>
	<label>Please enter your location</label>
	<form:input path="content"></form:input>
	<input type="submit" value="Search"/>
</form:form>
<div>
	<table>
		<thead>
		<th>Tên</th>
		<th>Địa chỉ</th>
		<th>Mô tả</th>
		<th>Hình ảnh</th>
		</thead>
		<tbody>
		 <c:forEach items="${results}" var="item">
			 <tr>
				 <td><h1>${item.ten}</h1></td>
				 <td>${item.vitri}</td>
				 <td>${item.mota}</td>
				 <td><img src="/uploadresources/${item.hinhanh}" style="width:304px;height:228px;"></td>
			 </tr>
		 </c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>