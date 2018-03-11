/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_cours01;

/**
 *
 * @author Moi
 */
public class Personne {
    private String Nom;
    private String Prenom;

    public Personne(String Nom, String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    
    
    
}
