package aeroport.classes;

public class Passager {
	private int numPasseport;
	private String nom;
	private String prenom;

	public Passager() {
	}

	public Passager(int numPasseport, String nom, String prenom) {
		this.numPasseport = numPasseport;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumPasseport() {
		return numPasseport;
	}

	public void setNumPasseport(int numPasseport) {
		this.numPasseport = numPasseport;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	@Override
	public String toString() {
		return "Passager [numPasseport=" + numPasseport + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Avion))
			return false;
		Passager other = (Passager) obj;
		if (other.numPasseport == this.numPasseport)
			return true;
		else
			return false;
	}


	
}
