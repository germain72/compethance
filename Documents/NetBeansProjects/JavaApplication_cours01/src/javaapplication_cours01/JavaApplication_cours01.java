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
public class JavaApplication_cours01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Facteur oF = new Facteur("GERMAIN", "Christophe");
        System.out.println("Premier projet en Java");
        System.out.println("");
        System.out.println("Bonne journée !");
        
        System.out.println("Nom du Facteur : " + oF.getNom());
        System.out.println("Prénom du Facteur : " + oF.getPrenom());
    }
    
}
