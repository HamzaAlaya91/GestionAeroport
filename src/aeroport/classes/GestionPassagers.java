package aeroport.classes;

public interface GestionPassagers {

	public boolean ajouterPassager(Passager p); // throws PassagerException;

	public boolean rechercherPassager(Passager p);

	public int rechercherPassager(int numPasseport);

	public boolean supprimerPassager(Passager p); // throws PassagerException;

	public void trierParNumPasseport();

	public void afficherPassagers();

}
