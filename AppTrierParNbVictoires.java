package fr.gns.app;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class AppTrierParNbVictoires {

    public static Joueur min(List<Joueur> joueurs) {
        Joueur j1 = joueurs.get(0);

        for (int i = 1; i < joueurs.size(); i++) {
            Joueur j2 = joueurs.get(i);

            if (j2.getNbVictoires() < j1.getNbVictoires()) {
                j1 = j2;
            }
        }

        return j1;
    }
    
    public static Joueur max(List<Joueur> joueurs) {
        Joueur j1 = joueurs.get(0);

        for (int i = 1; i < joueurs.size(); i++) {
            Joueur j2 = joueurs.get(i);

            if (j2.getNbVictoires() > j1.getNbVictoires()) {
                j1 = j2;
            }
        }

        return j1;
    }
    
    
    public static void sort(List<Joueur> joueurs) {
    	
    	 Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires));
    	 
    	 
    	 
    }
    		 
    public static List<Joueur> sort2(List<Joueur> joueurs) {
    	
    	List<Joueur> j1 = new ArrayList<Joueur>();
    	
    	for (int i = 0; i < 9; i++) {
    		 
    		 j1.add(min(joueurs)) ;
    		 joueurs.remove(min(joueurs)) ;
    		 
    		 
    	 }
   	 
   	 return j1 ;
   	 
   }	 
    	 
    	
        
    
    

    public static void main(String[] args) {
        List<Joueur> joueurs = new ArrayList<Joueur>();
        
    	joueurs.add( new Joueur( 101 , "BRAAS" , "France" , 25 ) ) ;
    	joueurs.add( new Joueur( 102 , "DARBOE" , "France" , 30 ) ) ;
    	joueurs.add( new Joueur( 103 , "FERT" , "France" , 18 ) ) ;
    	joueurs.add( new Joueur( 104 , "GAMBO" , "France" , 28 ) ) ;
    	joueurs.add( new Joueur( 105 , "LUCINA" , "France" , 33 ) ) ;
    	joueurs.add( new Joueur( 107 , "MEHDAOUI" , "France" , 27 ) ) ;
    	joueurs.add( new Joueur( 108 , "VICENTE" , "France" , 37 ) ) ;
    	joueurs.add( new Joueur( 109 , "MELLAJI" , "France" , 18 ) ) ;
    	joueurs.add( new Joueur( 111 , "SIF" , "France" , 25 ) ) ; 
    	
    	
    
       

        System.out.println("\nListe des joueurs :\n");
        for (Joueur joueur : joueurs) {
            System.out.println(joueur);
        }
        
        
        
        

        System.out.println("\nCelui qui a remporté le moins de victoires :\n" + min(joueurs));
        
        System.out.println("\nListe triée des joueurs :\n" + sort2(joueurs) );
        
        
      
        
    }
}
