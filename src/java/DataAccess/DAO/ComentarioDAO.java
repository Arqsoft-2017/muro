/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Comentario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author wilman
 */
public class ComentarioDAO {
    
    public EntityManagerFactory emf1= Persistence.createEntityManagerFactory("MuroPU");
    
    public Comentario persist(Comentario comentario) {
        EntityManager em = emf1.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(comentario);
            em.getTransaction().commit();
        } catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return comentario;
    }
    
}
