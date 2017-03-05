<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Arqsoft</h1>
        <hr/>
        <h2>Inicio de sesion</h2>
        <form action="autenticarUsuario" method="post">
            <label>Nombre de Usuario:</label>
            <input type="text" name="nick" placeholder="Username">
            <br/>
            <label>Contraseña</label>
            <input type="password" name="password" placeholder="Password">
            <br/>
            <button type="submit">Iniciar Sesion</button>
        </form>
        <br/><br/>
        <h2>Registro</h2>
        <form action="registrarUsuario" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" placeholder="Name">
            <br/>
            <label>Nombre de usuario:</label>
            <input type="text" name="nick" placeholder="Username">
            <br/>
            <label>Correo electrónico</label>
            <input type="text" name="correo" placeholder="Email">
            <br/>
            <label>Contraseña</label>
            <input type="password" name="password" placeholder="Password">
            <br/>
            <button type="submit">Registrar</button>
        </form>
        <br/><br/>
    </body>
</html>