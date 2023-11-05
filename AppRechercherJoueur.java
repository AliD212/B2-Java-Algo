package fr.gns.app;

import java.util.ArrayList;
import java.util.List;

public class AppRechercherJoueur {

	public static void main(String[] args) {

		List<Joueur> joueurs = new ArrayList<Joueur>() ;
		
		joueurs.add( new Joueur( 101 , "BRAAS" , "France" , 25 ) ) ;
		joueurs.add( new Joueur( 102 , "DARBOE" , "France" , 30 ) ) ;
		joueurs.add( new Joueur( 103 , "FERT" , "France" , 18 ) ) ;
		joueurs.add( new Joueur( 104 , "GAMBO" , "France" , 28 ) ) ;
		joueurs.add( new Joueur( 105 , "LUCINA" , "France" , 33 ) ) ;
		joueurs.add( new Joueur( 107 , "MEHDAOUI" , "France" , 27 ) ) ;
		joueurs.add( new Joueur( 108 , "VICENTE" , "France" , 37 ) ) ;
		joueurs.add( new Joueur( 109 , "MELLAJI" , "France" , 18 ) ) ;
		joueurs.add( new Joueur( 111 , "SIF" , "France" , 25 ) ) ;
		
		System.out.println( "\nListe des joueurs :\n" ) ;
		for( Joueur joueur : joueurs ) {
			System.out.println( joueur ) ;
		}
		
		Joueur joueur = new Joueur( 105 , "LUCINA" , "France" , 33 ) ;
		
		System.out.println( "\nPosition du joueur dans la liste :" ) ;
		System.out.println( joueurs.indexOf( joueur )) ;
		

	}

}
