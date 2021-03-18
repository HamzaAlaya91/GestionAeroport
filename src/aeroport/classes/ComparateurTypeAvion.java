package aeroport.classes;

import java.util.Comparator;

public class ComparateurTypeAvion implements Comparator<Avion> {
	
	public int compare(Avion a1, Avion a2) {
		return a1.getTypeAvion().compareTo(a2.getTypeAvion());
	}

}
