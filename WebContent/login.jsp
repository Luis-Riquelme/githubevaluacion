<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Login Eva2 - Luis Riquelme</title>
    </head>

    <body>
        <h1>Login Eva2 - Luis Riquelme</h1>
        <form action="loginsuccess.jsp" method="post">
            <table style="with: 100%">
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Contraseña</td>
                    <td><input type="password" name="password" /></td>
                </tr>

            </table>
            <input type="submit" value="Entrar" />
        </form>
    </body>

    </html>