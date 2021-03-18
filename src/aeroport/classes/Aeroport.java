package aeroport.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Aeroport {

	private Map<Avion, ListPassager> vol;

	public Aeroport(){
		vol = new HashMap<Avion, ListPassager>();
		
	}

	public void ajouterPassager(Avion avion, Passager passager) throws PassagerException{
		ListPassager listPassager = vol.get(avion);
		if(listPassager == null) {
			listPassager = new ListPassager();	
		}
		listPassager.ajouterPassager(passager);
		vol.put(avion, listPassager);
	}

	public void supprimerPassager(Avion avion, Passager passager) throws PassagerException{
		ListPassager listPassager = vol.get(avion);
		listPassager.supprimerPassager(passager);
		
	}

	public void afficherAvionsEtPassagers() {
		for(Avion avion : vol.keySet()) {
			System.out.println(avion);
			vol.get(avion).afficherPassagers();
			
		}
		
	}

	public void afficherAvions() {
		for (Avion avion : vol.keySet()) {
			System.out.println(avion);
		}
		
	}

	public boolean rechercherAvion(Avion avion) {
		return vol.containsKey(avion);
		
	}

	public Map<Avion,ListPassager> trierParTypeAvion() {
		TreeMap<Avion, ListPassager> volTrie = new TreeMap<Avion, ListPassager>(new ComparateurTypeAvion());
		volTrie.putAll(vol);
		return volTrie;
	}

}
