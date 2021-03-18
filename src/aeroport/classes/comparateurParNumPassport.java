package aeroport.classes;

import java.util.Comparator;

public class comparateurParNumPassport implements Comparator<Passager> {
	
	public int compare(Passager p1,Passager p2) {
		return p2.getNumPasseport() - p1.getNumPasseport();
	}
	
	

}
