package fr.gns.app;

import java.util.Comparator;

public class ComparateurNbVictoires implements Comparator<Joueur> {

	@Override
	public int compare(Joueur o1, Joueur o2) {
		
		if (o1.getNbVictoires() > o2.getNbVictoires()) {
            return 1;
        } 
		
		else if (o1.getNbVictoires() == o2.getNbVictoires()) {
            return 0;
        } 
		
		else {
            return -1;
        }
		
	}

}
