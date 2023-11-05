# B2-Java-AlgoCollections

Question 1.2)

Le résultat obtenu est que les joeurs sont différents car l'opérateur "==" ne compare pas le contenue mais la référence des objets .

Question 1.3) 

Le résultat obtenu est que les joeurs sont différents car l'opérateur "==" ne compare pas le contenue mais la référence des objets .
 
Question 1.6)

Le résultat obtenue reste le même car l'opérateur "==" compare seleument la nom de référence .

Question 1.7)

Le résultat obtenu est celui qu'on attendait car la methode equals compare le numero des deux joueurs .


Question 1.8)


public int compareTo(Joueur j) {
	    if (this.nbVictoires > j.nbVictoires) {
	        return 1;
	    } else if (this.nbVictoires < j.nbVictoires) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

Question 1.9)
La methode compareTO() permet de comparer le nombre de victoire d'un joueur avec un autre joueur en regardant s'ils sont egalité , on plus de victoire que l'autre joueur ou moins victoires

Question 2.2)


public static Joueur min(List<Joueur> joueurs) {
        Joueur j1 = joueurs.get(0);

        for (int i = 1; i < joueurs.size(); i++) {
            Joueur j2 = joueurs.get(i);

            if (j2.getNbVictoires() < j1.getNbVictoires()) {
                j1 = j2;
            }
        }

        return j1;



voici la methode qui me permet de garder uniquement le joueur qui a le moins de victoire .
Le résultat obtenue est correcte .



Question 2.3) 

  public static void sort(List<Joueur> joueurs) {
    	
    	 Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires));
    	 
    	 
    	 
    }


voici la methode qui ma permit de trier ma liste .
Le résultat obtenu est correcte .

Question 2.5)

AppTrierParNbVictoires :

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

cette methode permet de trie une liste dans l'ordre décroissant .
Le réssultat obtenu est correcte .



ComparateurNbVictoires : 

	public int compare(Joueur o1, Joueur o2) {
		if (o1.getNbVictoires() == o2.getNbVictoires()) {
			
			System.out.println("les joueurs ont le même nombre de victoire") ;
			
			
		}
		return 0;
	}

}

cette methode permet de comparer le nombre de victoire de deux joueur .
Le résultat obtenu est correcte .

Question 3.2)

La méthode Indexoff ne peut fonctionner car il manque la méthode equals quand on le rajouter on a bien l'indice du joueur .

question 3.4)



La méthode Indexoff ne peut fonctionner car la méthode equals est mal ecrit quand on modifie cette methode on obtient bien l'indice du joueur .


Question 3.4)

Le résultat obtenu est correcte .
