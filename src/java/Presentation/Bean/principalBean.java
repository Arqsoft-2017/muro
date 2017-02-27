/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManejoPublicacion;
import DataAccess.Entity.Publicacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author arqsoft2017i
 */
@ManagedBean
@ViewScoped
public class principalBean {
    
    public principalBean(){}
    
    public List verPublicaciones(){
        ManejoPublicacion publicacion = new ManejoPublicacion();
        List p = publicacion.publicaciones();
        System.out.println("awdw");
        
        System.out.println("asdsad");
        return p;
    }
    
}
