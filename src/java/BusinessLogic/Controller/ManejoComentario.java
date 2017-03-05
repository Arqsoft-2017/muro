/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.ComentarioDAO;
import DataAccess.DAO.PublicacionDAO;
import DataAccess.DAO.UsuarioDAO;
import DataAccess.Entity.Comentario;
import DataAccess.Entity.Publicacion;
import DataAccess.Entity.Usuario;
import java.util.Date;

/**
 *
 * @author arqsoft2017i
 */
public class ManejoComentario {
    public Comentario crearComentario(Date fecha, String contenido, Integer idUsuario, Integer idPublicacion ){
        
        UsuarioDAO usrDAO = new UsuarioDAO();
        PublicacionDAO publiDAO = new PublicacionDAO();
        ComentarioDAO comenDAO = new ComentarioDAO();
        
        Usuario usuario = usrDAO.buscarUsuarioId(idUsuario);
        Publicacion pub = publiDAO.buscarPublicacionId(idPublicacion);
        Comentario comentario = new Comentario();
        comentario.setComentarioContenido(contenido);
        comentario.setComentarioFecha(fecha);
        comentario.setComentarioPublicacionId(pub);
        comentario.setComentarioUsuarioId(usuario);        
        Comentario comenE = comenDAO.persist(comentario);
        return comenE;
            
    }
}
