package fr.gns.app;
import java.util.*;



public class AppTrierParNbVictoires {

    
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
       		 
    public static List<Joueur> sort2(List<Joueur> joueurs) {
    	
    	List<Joueur> j1 = new ArrayList<Joueur>();
    	
    	for (int i = 0; i < 9; i++) {
    		 
    		 j1.add(max(joueurs)) ;
    		 joueurs.remove(max(joueurs)) ;
    		 
    		 
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
    	
    	
    	Joueur j1 = new Joueur( 111 , "SIF" , "France" , 25 ) ;
    	Joueur j2 = new Joueur( 111 , "SIF" , "France" , 25 ) ;
       

        System.out.println("\nListe des joueurs :\n");
        for (Joueur joueur : joueurs) {
            System.out.println(joueur);
        }
        
        
        System.out.println("\nListe triée des joueurs :\n" + sort2(joueurs) );
        
        ComparateurNbVictoires comp1 = new ComparateurNbVictoires();
        int comp2 = comp1.compare(joueurs.get(1), joueurs.get(1));

        if (comp2 == 0) {
            System.out.println("\n les joueurs sont à égalité :\n");
        } else if (comp2 == 1) {
            System.out.println("\n le joueur a plus de victoires  :\n");
        } else if (comp2 == -1) {
            System.out.println("\n le joueur a moins de victoires :\n");
        }

    
    }
    
}
        	
        	
        	
   

