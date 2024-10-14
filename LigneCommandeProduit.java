/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.classes;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import ma.projet.test.ProduitCommandePK;
/**
 *
 * @author s
 */

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   
@Entity

public class LigneCommandeProduit {
@EmbeddedId
    
    private ProduitCommandePK pk;
@ManyToOne
        @JoinColumn(name = "produit",insertable=false,updatable= false)
private Produit produit;
@ManyToOne

        @JoinColumn(name = "commande",insertable=false,updatable= false)

private Commande commande;
    
    public LigneCommandeProduit  () {}

    
    // Getters et setters

    public LigneCommandeProduit(Produit produit, Commande commande) {
        this.produit = produit;
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public ProduitCommandePK getPk() {
        return pk;
    }

    public void setPk(ProduitCommandePK pk) {
        this.pk = pk;
    }

    
}

   
 

   

 

