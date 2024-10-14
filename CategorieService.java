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
import ma.projet.classes.Categorie;
import org.hibernate.Session;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author a
 */
public class CategorieService implements IDao<Categorie> {

    @Override
    public boolean create(Categorie o) {
        Session session ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        
    }
   

   

    @Override
    public Categorie findById(int id) {
        Session session ;
        Categorie e  ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Categorie) session.get(Categorie.class, id);
            session.getTransaction().commit();
            return e;
        
 }

    @Override
    public List<Categorie> findAll() {
        Session session ;
        List<Categorie>  categories ;
       
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            categories = session.createQuery("from Categorie").list();
            session.getTransaction().commit();
            return categories;
        

}   
}


