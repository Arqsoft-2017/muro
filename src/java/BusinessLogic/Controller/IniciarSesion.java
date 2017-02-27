/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.UsuarioDAO;
import DataAccess.Entity.Usuario;

/**
 *
 * @author arqsoft2017i
 */
public class IniciarSesion {
        
    public String iniciarSesion(String nick, String contrasena){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.buscarUsuario(nick,contrasena);
        if(usuarioDAO.getmessage().equals("Encontrado"))
            return "Bienvenido " + usuario.getUsuarioNombre(); 
        else if(usuarioDAO.getmessage().equals("Invalido"))
            return "Contrasena invalida";
        else
            return "Usuario no encontrado" ; 
    }
    
}
