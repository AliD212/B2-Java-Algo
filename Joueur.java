package fr.gns.app;

import java.util.List;

public class Joueur implements Comparable<Joueur> {
	
	private int numero ;
	private String nom ;
	private String pays ;
	private int nbVictoires = 0 ;
	
	public Joueur(int numero, String nom, String pays, int nbVictoires) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.pays = pays;
		this.nbVictoires = nbVictoires;
	}

	public Joueur(int numero, String nom, String pays) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.pays = pays;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbVictoires() {
		return nbVictoires;
	}

	public void setNbVictoires(int nbVictoires) {
		this.nbVictoires = nbVictoires;
	}

	@Override
	public String toString() {
		return "Joueur [numero=" + numero + ", nom=" + nom + ", pays=" + pays + ", nbVictoires=" + nbVictoires + "]";
	}

	@Override
	public int compareTo(Joueur o) {

		if( this.nbVictoires == o.nbVictoires ) {
			return 0 ;
		}
		else if( this.nbVictoires > o.nbVictoires ) {
			return 1 ;
		}
		else {
			return -1 ;
		}
	}
	
	public Joueur min(List<Joueur> joueurs) {
	    Joueur j1 = joueurs.get(0);

	    for (int i = 1; i < joueurs.size(); i++) {
	        Joueur j2 = joueurs.get(i);

	        if (j2.getNbVictoires() < j1.getNbVictoires()) {
	            j1 = j2;
	        }
	    }

	    return j1;
	}


	
	

}
