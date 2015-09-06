<%-- 
    Document   : uploaderror
    Created on : 5/09/2015, 09:45:32 PM
    Author     : AndresV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <p>Error: <%=session.getAttribute("sArError").toString()%></p>
  </body>
</html>
