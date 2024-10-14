/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

/**
 *
 * @author s
 */

import ma.projet.dao.IDao;
import java.util.List;
import ma.projet.classes.LigneCommandeProduit;
import org.hibernate.Session;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author a
 */
public class LigneCommandeService implements IDao<LigneCommandeProduit> {

    @Override
    public boolean create(LigneCommandeProduit o) {
        Session session ;
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        
    }

   
    

    @Override
    public LigneCommandeProduit findById(int id) {
        Session session ;
        LigneCommandeProduit e ;
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (LigneCommandeProduit) session.get(LigneCommandeProduit.class, id);
            session.getTransaction().commit();
            return e;
        
    }

    @Override
    public List<LigneCommandeProduit> findAll() {
        Session session ;
        List<LigneCommandeProduit>  lignescommandesProduits ;
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            lignescommandesProduits = session.createQuery("from LigneCommandeProduit").list();
            session.getTransaction().commit();
            return lignescommandesProduits;
        
    
    }
}  

