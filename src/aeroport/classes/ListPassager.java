package aeroport.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPassager implements GestionPassagers {
	
	List<Passager> listPassager;
	
	public  ListPassager() {
		listPassager = new ArrayList<Passager>();
	}
	
	
	
	@Override
	public boolean rechercherPassager(Passager p) {
		return listPassager.contains(p);
	}
	
	
	
	@Override
	public int rechercherPassager(int numPasseport) {
		for (int i = 0 ; i < listPassager.size() ; i++)
			if (listPassager.get(i).getNumPasseport() == numPasseport)
				return i;
		return -1;
	}
	
	

	@Override
	public boolean ajouterPassager(Passager p) {
		if (listPassager.contains(p)) {
			return false;
		} else {
			listPassager.add(p);
			return true;
		}
	}

	

	@Override
	public boolean supprimerPassager(Passager p) {
		return listPassager.remove(p);
	}

	@Override
	public void trierParNumPasseport() {
		Collections.sort(listPassager, new comparateurParNumPassport());
	}

	@Override
	public void afficherPassagers() {
		for(Passager p : listPassager) {
			System.out.println(p);
		}
		
	}
	
	

}
