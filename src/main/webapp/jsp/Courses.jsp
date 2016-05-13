<%-- 
    Document   : Courses
    Created on : 13 mai 2016, 15:53:11
    Author     : Ali
--%>

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
       
        <%out.print(request.getAttribute("allCourses"));%>
           
        
    </center>
    </body>
</html>
