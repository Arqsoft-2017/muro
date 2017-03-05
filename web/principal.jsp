
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html> 

<%

    String codigo = (String) session.getAttribute("ID");//Recoge la session
    String nombre = (String) session.getAttribute("nombre");//Recoge la session
    String nick = (String) session.getAttribute("nick");//Recoge la session
    String correo = (String) session.getAttribute("correo");//Recoge la session
%>

    <head> 
        <title>Muro</title> 
    </head> 
    <h:body> 
        <jsp:include page="mostrarPublicaciones"/>
        <form action="cerrarSesion"><button type="submit" style="float: right;">Cerrar Sesion</button></form>
        <br/>            
        <h1 style="text-align: center">Bienvenido <%=nombre%></h1>
        <hr/>   
        <h2 style="text-align: center">Crear publicacion</h2>
        <form action="crearPublicacion" method="post" style="text-align: center">
            <label>Contenido:</label><br/>
            <textarea rows="4" cols="50" name="contenido" placeholder="Escribe tu publicacion"></textarea>
            <br/>
            <button type="submit">Crear Publicacion</button>
        </form>
        <br/><br/>
        <div align="center">
            <table border="1" cellpadding="5">
                <caption><h2>Publicaciones</h2></caption>
                <tr>
                    <th>Fecha</th>
                    <th>Contenido</th>
                    <th>Comentarios</th>
                </tr>
                <c:forEach items="${publicaciones}" var="pb" >
                    <tr>
                        <th>${pb.getPublicacionFecha()}</th>
                        <th>${pb.getPublicacionContenido()}</th>
                        <%-- Emp email: <%= ((Employee)(pageContext.findAttribute("emp"))).getName() --%>
                        <th>
                            <form method="post" action="crearComentario">
                                <label>Comentario:</label><br/>
                                    <textarea rows="3" cols="30" name="comentario" placeholder="Escribe tu comentario"></textarea>
                                    <br/>
                                    <button type="submit">Crear Comentario</button>
                            </form>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <script src="assets/js/jquery-3.1.1.min.js"></script>
        <script>
            $(document).ready(function(){
            });
        </script>
    </h:body> 
</html>
