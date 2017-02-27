/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;
import BusinessLogic.Controller.IniciarSesion;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author arqsoft2017i
 */
@ManagedBean
@ViewScoped
public class iniciarSesionBean {
    private String nick;
    private String contrasena;
    private String message;
    FacesContext fc = FacesContext.getCurrentInstance();
    ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler)fc.getApplication().getNavigationHandler();
    
    public iniciarSesionBean(){};
    
    public String getnick(){
        return this.nick;
    }
    
    public void setnick(String nick){
        this.nick = nick;
    }
    
    public String getcontrasena(){
        return this.contrasena;
    }
    
    public void setcontrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public String getmessage(){
        return this.message;
    }
    
    public void setmessage(String message){
        this.message = message;
    }
    
    public void login(){
        IniciarSesion is = new IniciarSesion();
        message = is.iniciarSesion(nick, contrasena);
        if(message.contains("Bienvenido"))
            nav.performNavigation("principal.xhtml");
    }
}
