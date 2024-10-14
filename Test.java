/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.service.ProduitService;

/**
 *
 * @author s
 */

    
import java.util.Date;
import ma.projet.classes.Categorie;
import ma.projet.classes.Commande;
import ma.projet.classes.LigneCommandeProduit;
import ma.projet.classes.Produit;
import ma.projet.service.CategorieService;

import ma.projet.service.CommandeService;
import ma.projet.service.LigneCommandeService;

public class Test {
    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
CategorieService cc = new CategorieService();

            ps.create(new Produit("AE12", 10, cc.findById(1)));
            ps.create(new Produit("BE12", 20, cc.findById(2)));
            ps.create(new Produit("CE12", 30, cc.findById(3)));
        CommandeService cs = new CommandeService();

            cs.create(new Commande(new Date(113, 2, 14)));
            
         LigneCommandeService lcs = new LigneCommandeService();

            lcs.create(new LigneCommandeProduit (ps.findById(1), cs.findById(3)));
            lcs.create(new LigneCommandeProduit (ps.findById(1), cs.findById(3)));
            lcs.create(new LigneCommandeProduit (ps.findById(1), cs.findById(3)));
          

            cc.create(new Categorie ("789", "lll", ps.findAll()));
            cc.create(new Categorie ("456", "jjj", ps.findAll()));
            cc.create(new Categorie ("123", "mmm", ps.findAll()));
            
            
//           
        
        

        // Tester les méthodes
        ps.findByCategory("tata");
        ps.findByDateRange (new Date(113, 2, 14), new Date(113, 2, 15));
        ps.findProduitsByCommande(4);
        ps.findProduitsPrixSuperieur(100);
    }
}

    

