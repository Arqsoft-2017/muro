/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;
import java.util.Date;
//import java.sql.Date;
import DataAccess.DAO.PublicacionDAO;
import DataAccess.DAO.UsuarioDAO;
import DataAccess.Entity.Publicacion;
import DataAccess.Entity.Usuario;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author tania
 */public class ManejoPublicacion {
    public String crearPublicacion(Date fecha, String contenido ){
        Publicacion publicacion = new Publicacion();
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();
        java.sql.Date date = new java.sql.Date(currentDate.getTime());
        sesionUsuario sesion = new sesionUsuario();
        Usuario usuario = sesion.getusuarioActual();
        publicacion.setPublicacionFecha(date);
        publicacion.setPublicacionContenido(contenido);
        publicacion.setPublicacionUsuarioId(usuario);
        PublicacionDAO publiDAO = new PublicacionDAO();
        Publicacion publiE = publiDAO.persist(publicacion);
        if( publiE != null){            
                return "la publicacion " + publicacion.getPublicacionContenido() + " ha sido creado."; 
        }else{
                return "La publicacion no pudo ser creada." ;  
            }
    }
    
    public List publicaciones(){
        PublicacionDAO publiDAO = new PublicacionDAO();
        return publiDAO.buscarpublicaciones();
    }
    
}