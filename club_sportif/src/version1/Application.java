package version1;

public class Application {

	public static void main(String[] args) {
		Club nouveauClub = new Club ("Les fumeurs repentis");
		Individu martin =nouveauClub.ajouterMembre("Martin", "Jean Kévin")  ;
		System.out.println();
		martin.ajouterSport(0);
		martin.ajouterSport(2);
		
		Individu steph = nouveauClub.ajouterMembre("de Monaco", "Stéphanie")  ;
		Individu poussin = nouveauClub.ajouterMembre("Inugai", "Toshiki")  ;
		nouveauClub.ajouterMembre("Martin", "Jean Kévin")  ;
		Individu teddy = nouveauClub.ajouterMembre("Ridner", "Teddy")  ;
		steph.ajouterSport(1);
		steph.ajouterSport(4);
		
		//nouveauClub.lister();
		
		// recherche un membre donné (par son nom et prénom) et affiche les sports qu’il pratique.
		Individu inconnu = nouveauClub.trouverMembre("de Monaco", "Stéphanie") ;

		System.out.println(inconnu);

	}

}
