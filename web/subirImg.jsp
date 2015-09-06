<%-- 
    Document   : subirImg
    Created on : 5/09/2015, 06:40:34 PM
    Author     : AndresV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>File Uploading Form</title>
  </head>
  <body>
    <h3>File Upload:</h3>
    Select a file to upload: <br />
    <form action="servlets" method="post"
          enctype="multipart/form-data">
      <input type="file" name="fichero"  />
      <br />
      <input type="submit" value="Upload File" />
    </form>
  </body>
</html>