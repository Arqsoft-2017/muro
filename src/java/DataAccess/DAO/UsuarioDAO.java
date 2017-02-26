/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;
import java.io.*;
import java.util.*;
import DataAccess.Entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author wilman
 */
public class UsuarioDAO {
    
    public EntityManagerFactory emf1= Persistence.createEntityManagerFactory("MuroPU");
    
    public Usuario persist(Usuario usuario) {
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(usuario);
            em.getTransaction().commit();
            em.close();
            return usuario;
        } catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }    
    
    public Usuario delete(int usuarioID) {
        EntityManager em = emf1.createEntityManager();
        Usuario usuario = em.find(Usuario.class, usuarioID);
        em.getTransaction().begin();
        try {
            em.remove(usuario);
            em.getTransaction().commit();
            em.close();
            return usuario;
        } catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }
}
