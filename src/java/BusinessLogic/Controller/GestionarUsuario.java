/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;
import DataAccess.DAO.UsuarioDAO ;  
import DataAccess.DAO.AutenticacionDAO ;
import DataAccess.Entity.Usuario ; 
import DataAccess.Entity.Autenticacion ; 
/**
 *
 * @author arqsoft2017i
 */
public class GestionarUsuario {
    
    public GestionarUsuario(){}
    
    public String crearUsuario ( String nombre, String nick, String contrasena, String correo ) { 
        Usuario usuario = new Usuario();
        Autenticacion autenticacion = new Autenticacion();

        usuario.setUsuarioNombre(nombre ); 
        usuario.setUsuarioCorreo(correo);
        usuario.setUsuarioNick(nick);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        AutenticacionDAO autenticacionDAO = new AutenticacionDAO();
        
        Usuario usuarioE = usuarioDAO.persist(usuario);
        
        if (usuarioE != null) {
            autenticacion.setAutenticacionId(usuarioE.getUsuarioId());
            autenticacion.setAutenticacionContrasena(contrasena);

            Autenticacion autenticacionE = autenticacionDAO.persist(autenticacion);
            if (autenticacionE != null) {
                return "El usuario ha sido registrado, su ID es " + usuario.getUsuarioId() + ".";
            }
            else {
                usuarioDAO.delete(usuarioE.getUsuarioId());
                return "El usuario no pudo ser registrado.";
            }
        }  
        else 
            return "El usuario no pudo ser registrado.";        
    }
    
}
