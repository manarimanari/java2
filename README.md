# java2
projet java
Voici un résumé des étapes pour développer l'application de gestion de stock pour un magasin de vente de produits informatiques :

### A. Couche Persistance
1. **Développer les classes entités** dans le package **`ma.projet.classes`** : 
   - Créer des classes entités représentant les objets du diagramme de classe (ex. Produit, Categorie, Commande, LigneCommande).
2. **Fichier de configuration Hibernate** : 
   - Créer le fichier **`hibernate.cfg.xml`** dans le package **`ma.projet.config`** pour configurer Hibernate (connexion à la base de données, mapping des entités).
3. **Classe HibernateUtil** : 
   - Créer la classe **`HibernateUtil`** dans le package **`ma.projet.util`** pour gérer la création et la gestion de la session Hibernate via la classe **`SessionFactory`**.

### B. Couche Service
1. **Interface IDao** :
   - Créer une interface générique **`IDao`** dans le package **`ma.projet.dao`** pour définir les opérations CRUD (Create, Read, Update, Delete).
   
2. **Classes Service** :
   - Créer les classes **`ProduitService`**, **`CategorieService`**, **`CommandeService`**, et **`LigneCommandeService`** dans le package **`ma.projet.service`**, chacune implémentant l'interface **`IDao`** pour gérer les entités correspondantes.

3. **Méthode pour afficher les produits par catégorie** :
   - Ajouter cette méthode dans la classe **`ProduitService`** pour lister les produits d'une catégorie donnée.

4. **Méthode pour afficher les produits commandés entre deux dates** :
   - Ajouter cette méthode dans la classe **`ProduitService`** pour lister les produits commandés dans un intervalle de dates.

5. **Méthode pour afficher les produits d'une commande donnée** :
   - Créer une méthode dans **`CommandeService`** pour afficher les produits associés à une commande. Par exemple :
     ```
     Commande : 4 Date : 14 Mars 2013
     Liste des produits :
     Référence   Prix   Quantité
     ES12        120 DH 7
     ZR85        100 DH 14
     EE85        200 DH 5
     ```

6. **Méthode pour afficher les produits dont le prix est supérieur à 100 DH** :
   - Dans la classe **`ProduitService`**, créer une méthode utilisant une requête nommée pour lister les produits avec un prix supérieur à **100 DH**.

### C. Test
- Créer des programmes de test pour valider toutes les méthodes ci-dessus. Ces tests doivent inclure :
   - Afficher la liste des produits par catégorie.
   - Afficher les produits commandés entre deux dates.
   - Afficher les produits d'une commande donnée.
   - Afficher la liste des produits dont le prix dépasse 100 DH.

Ces étapes couvriront l'essentiel du développement pour l'application de gestion de stock.
