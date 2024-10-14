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
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ma.projet.dao.IDao;
import java.util.List;
import ma.projet.classes.Commande;
import org.hibernate.Session;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author a
 */
public class CommandeService implements IDao<Commande> {

    @Override
    public boolean create(Commande o) {
        Session session ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        
    }
   

   

    @Override
    public Commande findById(int id) {
        Session session ;
        Commande e  ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Commande) session.get(Commande.class, id);
            session.getTransaction().commit();
            return e;
        
 }

    @Override
    public List<Commande> findAll() {
        Session session ;
        List<Commande>  commandes ;
       
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            commandes = session.createQuery("from Commande").list();
            session.getTransaction().commit();
            return commandes;
        

}   
}


