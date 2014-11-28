<%--
  Created by IntelliJ IDEA.
  User: shali_000
  Date: 11/27/2014
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty products}">
  <c:forEach var="product" varStatus="status" items="${products}">
    <tr>
      <br>
      <td><c:out value="${product.description}"/></td>
      <td><c:out value="${product.price}"/></td>
    </tr>
  </c:forEach>
</c:if>
</body>
</html>
