/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;
import java.util.*;
import java.sql.Date;
import BusinessLogic.Controller.ManejoPublicacion;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

/**
 *
 * @author tania
 */
public class publicacionBean {
    private Date fecha;
    private String contenido;
    private String message;
    
    public publicacionBean() {}

    public Date getFecha() {
        return fecha;
    }

    public void setFecha( Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void crearPublicacion(){
        ManejoPublicacion publicacion = new ManejoPublicacion();
        message = publicacion.crearPublicacion(fecha,contenido);
    }
    
}