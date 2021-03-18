package aeroport.Test;

import aeroport.classes.Aeroport;
import aeroport.classes.Avion;
import aeroport.classes.Passager;
import aeroport.classes.PassagerException;

public class Main {

	public static void main(String[] args) {
		
		Aeroport aeroport = new Aeroport();
		
		Passager passager1 = new Passager(123,"hamza","alaya");
		Passager passager2 = new Passager(123,"syrine","hssan");
		Passager passager3 = new Passager(123,"walid","alaya");
		Passager passager4 = new Passager(123,"seif","alaya");
		
		Avion avion1 = new Avion(111, "A10", "Airbus");
		Avion avion2 = new Avion(222, "S10", "Boing");

		try {
			aeroport.ajouterPassager(avion1, passager1);
			aeroport.ajouterPassager(avion1, passager2);
			aeroport.ajouterPassager(avion2, passager3);
			aeroport.ajouterPassager(avion2, passager4);
		} catch (PassagerException e) {

			System.out.println(e.getMessage());
		}
		
		
		
		aeroport.afficherAvionsEtPassagers();
		
		System.out.println("------------------------------------------");
		
		try {
			aeroport.ajouterPassager(avion1, passager1);
		} catch (PassagerException e) {
			System.out.println(e.getMessage());		
		}

		aeroport.afficherAvionsEtPassagers();
	}

}
