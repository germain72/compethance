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
public class Facteur extends Personne implements iFacteur{
    
    public Facteur(String Nom, String Prenom) {
        super(Nom, Prenom);
    }

    @Override
    public void Distribuer() {
        System.out.println("Distribuer du courrier !");
    }

    @Override
    public void Vendre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
