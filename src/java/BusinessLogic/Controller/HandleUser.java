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
public class HandleUser {
    
    public String createUser ( String name, String username, String password, String email ) { 
        Usuario user = new Usuario ( ) ; 
        Autenticacion aut = new Autenticacion();
        user.setUsuarioNombre(name);
        user.setUsuarioNick(username);
        aut.setAutenticacionContrasena(password);
        user.setUsuarioCorreo(email);
        
        UsuarioDAO userDAO = new UsuarioDAO();
        AutenticacionDAO autDAO = new AutenticacionDAO();
        Usuario userE = userDAO.persist(user);
        aut.setAutenticacionId(userE.getUsuarioId());
        Autenticacion autE = autDAO.persist(aut);
        if( userE != null && autE  != null){
            return "El usuario " + userE.getUsuarioNombre() + " ha sido creado."; 
        }else{
            return "El usuario no pudo ser creado." ;  
        }
        
        
    } 
    
}
