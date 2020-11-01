<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@page import="net.javaguides.login.database.*"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Eva2 - Luis Riquelme</title>
        </head>

        <body>

            <jsp:useBean id="login" class="net.javaguides.login.bean.LoginBean" />

            <jsp:setProperty property="*" name="login" />

            <%
  LoginDao loginDao = new LoginDao();
   boolean status = loginDao.validate(login);
   if (status) {
           out.print("<h1>Has iniciado sesión con éxito</h1>");
   }
 %>
        </body>

        </html>