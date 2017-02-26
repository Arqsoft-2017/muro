/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;
import BusinessLogic.Controller.GestionarUsuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author arqsoft2017i
 */
@ManagedBean
@ViewScoped
public class RegistrarUsuarioBean {
    private String nombre;
    private String nick;
    private String correo;
    private String contrasena;
    private String message;
    
    public RegistrarUsuarioBean() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void createAccount(){
        GestionarUsuario gu = new GestionarUsuario();
        message = gu.crearUsuario(nombre, nick, contrasena, correo);
    }
    
}
