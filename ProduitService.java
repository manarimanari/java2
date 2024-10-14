/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
package ma.projet.service;

import java.util.Date;
import ma.projet.dao.IDao;

import java.util.List;
import ma.projet.classes.Produit;
import org.hibernate.Session;
import ma.projet.util.HibernateUtil;
import org.hibernate.Query;

/**
 *
 * @author a
 */
public class ProduitService implements IDao<Produit> {

    @Override
    public boolean create(Produit o) {
        Session session ;
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
       
    }

    
   
    

    @Override
    public Produit findById(int id) {
        Session session ;
        Produit e  ;
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Produit) session.get(Produit.class, id);
            session.getTransaction().commit();
            return e;
        
    }

    @Override
    public List<Produit> findAll() {
        Session session ;
        List<Produit>  produits ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            produits = session.createQuery("from Produit").list();
            session.getTransaction().commit();
            return produits;
        
    }
// Méthode pour trouver les produits par catégorie
    public List<Produit> findByCategory(String categorie) {
        Session session ;
        List<Produit> produits=null ;
        
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hql4=" FROM produit where categorie = :categorie";
            Query query = session.createQuery(hql4);
                             query .setString("categorie", categorie);
                            List results=  query.list();
            session.getTransaction().commit();
            return produits;
        
    }
    // Méthode pour trouver les produits commandés entre deux dates
public List<Produit> findByDateRange(Date startDate, Date endDate) {
     Session session ;
    List<Produit> produits=null ;
             session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
        String hql3 =" FROM produit WHERE P. date BETWEEN :startDate AND :endDate";
        Query query = session.createQuery(hql3);
                         query .setDate("startDate", startDate);
                         query .setDate("endDate", endDate);
                       List results=  query .list();
        
        session.getTransaction().commit();
            return produits;
        
    }
// Méthode pour afficher les produits d'une commande donnée

public List<Produit> findProduitsByCommande(int commandeId) {
     Session session ;
    List<Produit> produits=null ;
             session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
        String hql2="FROM Produit P WHERE P.commande.id = :commandeId ";
        Query query = session.createQuery(hql2);
        List results = query.list();        
                       
        
        session.getTransaction().commit();
            return produits;
       
    }
// Méthode pour afficher les produits dont le prix est supérieur à 100 DH


public List<Produit> findProduitsPrixSuperieur(double prixMin) {
     Session session ;
    List<Produit> produits=null ;
    
             session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();
        String hql= "FROM Produit WHERE where P.prix > :prixMin , Produit.class";
        Query query = session.createQuery(hql);
                         query .setDouble("prixMin", prixMin);
                          
        List results = query.list();
        
        session.getTransaction().commit();
            return produits;
        
}}






