package fr.gns.app;





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
	public int compareTo(Joueur j) {
	    if (this.nbVictoires > j.nbVictoires) {
	        return 1;
	    } else if (this.nbVictoires < j.nbVictoires) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

	

}
