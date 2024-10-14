/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   package ma.projet.classes;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;

    
    private Date date;

   
    public Commande() {}

    public Commande(Date date) {
        
        this.date = date;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
   
}
 

 

