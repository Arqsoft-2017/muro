/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.Entity.Usuario;

/**
 *
 * @author arqsoft2017i
 */
public class sesionUsuario {
    static private Usuario usuarioActual;
    
    public sesionUsuario(){}
    
    public void setusuarioActual(Usuario usuario){
        usuarioActual = usuario;
    }
    
    public Integer getusuarioId(){
        return usuarioActual.getUsuarioId();
    }
    
    public String getusuarioNombre(){
        return usuarioActual.getUsuarioNombre();
    }
    
    public Usuario getusuarioActual(){
        return usuarioActual;
    }
}
