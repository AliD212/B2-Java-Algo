package fr.gns.app;

public class AppComparerJoueurs {
	
	public static void main(String[] args) {

		Joueur jr1 = new Joueur( 28 , "Parker" , "France" , 150 ) ;
		Joueur jr2 = new Joueur( 28 , "Watson" , "France" , 150 ) ;
		System.out.println( "Premier joueur : " + jr1 ) ;
		System.out.println( "Second joueur  : " + jr2 ) ;
		
		
		System.out.println( "\nClassement des deux joueurs :\n" ) ;
		if( jr1.compareTo( jr2 ) == 0 ) {
			System.out.println( "\t" + jr1.getNom() + " et " + jr2.getNom() + "sont ex aequo.\n" ) ;
		}
		else if( jr1.compareTo( jr2 ) == 1 ) {
			System.out.println( "\t" + jr1.getNom() + " est meilleur que " + jr2.getNom() + ".\n" ) ;
		}
		else {
			System.out.println( "\t" + jr2.getNom() + " est meilleur que " + jr1.getNom() + ".\n" ) ;
		}

	}

}