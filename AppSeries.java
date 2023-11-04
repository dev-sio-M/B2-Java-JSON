

	public static void main(String[] args) {
		
	List<Acteur> acteurs = new ArrayList<>() ;
		
	acteurs.add( new Acteur( "BRAAS" , "Bastien") ) ;
	acteurs.add( new Acteur( "DARBOE" , "Ali" ) ) ;
	acteurs.add( new Acteur( "LUCINA" , "Mathis" ) ) ;

	
	//Afficher les trois acteurs :
	
	//for (Acteur acteur : acteurs) {
//System.out.println(acteur);
            //}

	
	
	//Afficher le nom des trois acteurs :
	
//for (Acteur acteur : acteurs) {
            //System.out.println(acteur.getNom());
       //}
        
		List<Serie> series = new ArrayList<>();

		Serie serie1 = new Serie("Prison Break");
		Saison saison1Serie1 = new Saison(1, 2005);
		saison1Serie1.ajouterEpisode(new Episode(1, "La grande évasion", 41));
		saison1Serie1.ajouterEpisode(new Episode(2, "Allen", 39));
		saison1Serie1.ajouterEpisode(new Episode(3, "Mise à l'épreuve", 40));
		serie1.ajouterSaison(saison1Serie1);
		
		Saison saison2Serie1 = new Saison(2, 2006);
		saison2Serie1.ajouterEpisode(new Episode(1, "Chasse à l'homme", 50));
		saison2Serie1.ajouterEpisode(new Episode(2, "Otis", 47));
		saison2Serie1.ajouterEpisode(new Episode(3, "L'erreur est humaine", 47));
		serie1.ajouterSaison(saison2Serie1);
		
		Saison saison3Serie1 = new Saison(3, 2007);
		saison3Serie1.ajouterEpisode(new Episode(1, "Survivre", 45));
		saison3Serie1.ajouterEpisode(new Episode(2, "L'eau et le feu", 50));
		saison3Serie1.ajouterEpisode(new Episode(3, "Le chat et la souris", 50));
		serie1.ajouterSaison(saison3Serie1);
		
		Saison saison4Serie1 = new Saison(4, 2008);
		saison4Serie1.ajouterEpisode(new Episode(1, "De Charybde...", 45));
		saison4Serie1.ajouterEpisode(new Episode(2, "...En Scylla", 50));
		saison4Serie1.ajouterEpisode(new Episode(3, "A bout de souffle", 50));
		serie1.ajouterSaison(saison4Serie1);
		
		Saison saison5Serie1 = new Saison(5, 20017);
		saison5Serie1.ajouterEpisode(new Episode(1, "Ogygia", 49));
		saison5Serie1.ajouterEpisode(new Episode(2, "La théorie des jeux", 56));
		saison5Serie1.ajouterEpisode(new Episode(3, "Le menteur", 56));
		serie1.ajouterSaison(saison5Serie1);
		series.add(serie1);

		Serie serie2 = new Serie("La Casa De Papel");
		Saison saison1Serie2 = new Saison(1, 2017);
		saison1Serie2.ajouterEpisode(new Episode(1, "Efectuar lo acordado", 54));
		saison1Serie2.ajouterEpisode(new Episode(2, "Imprudencias letales", 52));
		saison1Serie2.ajouterEpisode(new Episode(3, "Errar al disparar", 56));
		serie2.ajouterSaison(saison1Serie2);
		
		Saison saison2Serie2 = new Saison(2, 2019);
		saison2Serie2.ajouterEpisode(new Episode(1, "On est de retour", 40));
		saison2Serie2.ajouterEpisode(new Episode(2, "Aïkido", 45));
		saison2Serie2.ajouterEpisode(new Episode(3, "48 mètres sous terre", 52));
		serie2.ajouterSaison(saison2Serie2);
		series.add(serie2);

		Serie serie3 = new Serie("Stranger Things");
		Saison saison1Serie3 = new Saison(1, 2016);
		saison1Serie3.ajouterEpisode(new Episode(1, "Chapitre Un : La Disparition de Will Byers", 50));
		saison1Serie3.ajouterEpisode(new Episode(2, "Chapitre Deux : La Barjot de Maple Street", 55));
		saison1Serie3.ajouterEpisode(new Episode(3, "Chapitre Trois : Petit Papa Noël", 51));
		serie3.ajouterSaison(saison1Serie3);

		Saison saison2Serie3 = new Saison(2, 2017);
		saison2Serie3.ajouterEpisode(new Episode(1, "Chapitre Un : MADMAX", 45));
		saison2Serie3.ajouterEpisode(new Episode(2, "Chapitre Deux : Des bonbons ou un sort, espèce de taré", 52));
		saison2Serie3.ajouterEpisode(new Episode(3, "Chapitre Trois : Le Batracien", 40));
		serie3.ajouterSaison(saison2Serie3);

		Saison saison3Serie3 = new Saison(3, 2019);
		saison3Serie3.ajouterEpisode(new Episode(1, "Chapitre Un : Suzie, tu me reçois ?", 48));
		saison3Serie3.ajouterEpisode(new Episode(2, "Chapitre Deux : Comme des rats", 47));
		saison3Serie3.ajouterEpisode(new Episode(3, "Chapitre Trois : La Maître-nageuse disparue", 47));
		serie3.ajouterSaison(saison3Serie3);

		Saison saison4Serie3 = new Saison(4, 2022);
		saison4Serie3.ajouterEpisode(new Episode(1, "Chapitre Un : Le Club Hellfire", 59));
		saison4Serie3.ajouterEpisode(new Episode(2, "Chapitre Deux : La Malédiction de Vecna", 45));
		saison4Serie3.ajouterEpisode(new Episode(2, "Chapitre Trois : Le Monstre et la Super-héroïne", 45));
		serie3.ajouterSaison(saison4Serie3);
		series.add(serie3);

		
		//Pour chaque série, afficher le titre ainsi que le nombre de saisons : 
		
		//for (Serie serie : series) {
		    //System.out.println("Titre : " + serie.getTitre());
		    //System.out.println("Nombre de saisons : " + serie.getSaisons().size());
		    //for (Saison saison : serie.getSaisons()) {
		    //}
		//}
		
		
		
		
		//Afficher le titre et la durée de chaque épisode de la deuxième saison de la première série :
		
		//for (Serie serie : series) {
		    //if (serie.getTitre().equals("Prison Break")) {
		        //for (Saison saison : serie.getSaisons()) {
		           //if (saison.getNumero() == 2) {
		                //System.out.println("Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
		                //for (Episode episode : saison.getEpisodes()) {
		                    //System.out.println("  Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
		                //}
		            //}
		        //}
		    //}
		
		
		
		//Afficher le titre et la durée de chaque épisode de chaque saison de la première série : 
		
		//for (Serie serie : series) {
		    //if (serie.getTitre().equals("Prison Break")) {
		        //for (Saison saison : serie.getSaisons()) {
		            //System.out.println("Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
		           //for (Episode episode : saison.getEpisodes()) {
		                //System.out.println("  Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
		            //}
		        //}
		    //}
		//}
		
		
		
		//Afficher le titre, la durée et l’année de la saison de chaque épisode de chaque série :
		
		//for (Serie serie : series) {
		    //System.out.println("Titre de la série : " + serie.getTitre());
		    //for (Saison saison : serie.getSaisons()) {
		        //System.out.println("  Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
		        //for (Episode episode : saison.getEpisodes()) {
		            //System.out.println("    Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
		        //}
		    //}
		//}
		
		
		
		//Afficher le titre et la durée totale de chaque saison de la première série :
		
		//for (Serie serie : series) {
		    //if (serie.getTitre().equals("Prison Break")) {
		        //for (Saison saison : serie.getSaisons()) {
		            //System.out.println("Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
		            //int dureeTotale = 0;
		            //for (Episode episode : saison.getEpisodes()) {
		                //dureeTotale += episode.getDuree();
		                //System.out.println("  Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
		           // }
		            //System.out.println("  Durée totale de la saison : " + dureeTotale + " minutes");
		        //}
		    //}
		//}

		
		
		//Afficher le titre de l’épisode le plus long ainsi que son numéro de saison et le nom de la série :
		
		//String titreEpisodePlusLong = "";
		//int dureeEpisodePlusLong = 0;
		//int numeroSaison = 0;
		//String nomSerie = "";

		//for (Serie serie : series) {
		    //for (Saison saison : serie.getSaisons()) {
		        //for (Episode episode : saison.getEpisodes()) {
		            //if (episode.getDuree() > dureeEpisodePlusLong) {
		                //dureeEpisodePlusLong = episode.getDuree();
		                //titreEpisodePlusLong = episode.getTitre();
		                //numeroSaison = saison.getNumero();
		                //nomSerie = serie.getTitre();
		            //}
		        //}
		    //}
		//}

		//System.out.println("Titre de l'épisode le plus long : " + titreEpisodePlusLong);
		//System.out.println("Numéro de saison : " + numeroSaison);
		//System.out.println("Nom de la série : " + nomSerie);

		
			List<Role> roles = new ArrayList<>();

			roles.add(new Role(acteurs.get(0), series.get(0), "Scofield", "Michael"));
			roles.add(new Role(acteurs.get(1), series.get(1), "Cortés", "Anibal"));
			roles.add(new Role(acteurs.get(2), series.get(2), "Wheeler", "Mike"));

			
			//Afficher le nom et le prénom de chaque rôle :
			
			//for (Role role : roles) {
			    //System.out.println("\n Nom : " + role.getNom() + "\n Prénom : " + role.getPrenom());
			//}

			
			
			//Afficher le nom et le prénom de chaque rôle ainsi que le titre de la série et le nom et le prénom de l’acteur :
			
			//for (Role role : roles) {
			    //System.out.println("\n Série : " + role.getSerie().getTitre() + "\n Nom : " + role.getNom() + "\n Prénom : " + role.getPrenom() + "\n Acteur : " + role.getActeur().getNom() + " " + role.getActeur().getPrenom());
			//}
			

			
			//Afficher le titre des séries dans lesquelles joue le deuxième acteur :
			
			//Acteur deuxiemeActeur = acteurs.get(1);
	        //for (Role role : roles) {
	            //if (role.getActeur().equals(deuxiemeActeur)) {
	                //System.out.println(role.getSerie().getTitre());
	           //}
	        //}

	}

