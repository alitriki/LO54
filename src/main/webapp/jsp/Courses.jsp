<%-- 
    Document   : Courses
    Created on : 13 mai 2016, 15:53:11
    Author     : Ali
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="fr.utbm.gestion_de_formations_en_ligne.entity.Course"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table border="1">
            <th>title</th>
            <th>description</th>
                <c:forEach items="${requestScope.allCourses}" var="course">
                <tr>
                    <td>
                        aa<c:out value="${course.title}"/>
                    </td>
                    <td>
                        <c:out value="${course.description}"/> 
                    </td>     
                </tr>
            </c:forEach>    
        </table>

    </center>
</body>
</html>
