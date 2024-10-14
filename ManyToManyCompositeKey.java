/*
 * To change this license header, choose License Headers in Project Propertips.
 * To change this template file, choose Tools | Templatps
 * and open the template in the editor.
 */
package ma.projet.test;

/**
 *
 * @author s
 */
    /*
 * To change this license header, choose License Headers in Project Propertips.
 * To change this template file, choose Tools | Templatps
 * and open the template in the editor.
 */

import ma.projet.classes.LigneCommandeProduit;
import ma.projet.classes.Produit;
import ma.projet.classes.Commande;
import java.util.Date;
import ma.projet.service.CategorieService;
import ma.projet.service.LigneCommandeService;
import ma.projet.service.ProduitService;
import ma.projet.service.CommandeService;

/**
 *
 * @author a
 */
public class ManyToManyCompositeKey {

    public static void main(String[] args) {
        CommandeService cs = new CommandeService();
        ProduitService ps = new ProduitService();
        LigneCommandeService lcp = new LigneCommandeService();
CategorieService css=new CategorieService();
        cs.create(new Commande( new Date(1900,10,12)));
        cs.create(new Commande(new Date(1900,10,12)));

        ps.create(new Produit("AE12", 10,css. findById(1)));
        ps.create(new Produit("BE12", 10,css. findById(2)));
        
        LigneCommandeProduit lignecommandeproduit = new LigneCommandeProduit();
        lignecommandeproduit.setPk(new ProduitCommandePK(1,2,300));
        lcp.create(lignecommandeproduit);
        



}}

    

