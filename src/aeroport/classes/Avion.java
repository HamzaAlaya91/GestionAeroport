package aeroport.classes;

public class Avion {

	private int immatriculation;
	private String nomAvion;
	private String typeAvion;

	public Avion() {
	}

	public Avion(int immatriculation, String nomAvion, String typeAvion) {
		this.immatriculation = immatriculation;
		this.nomAvion = nomAvion;
		this.typeAvion = typeAvion;
	}

	public int getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(int immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getNomAvion() {
		return nomAvion;
	}

	public void setNomAvion(String nomAvion) {
		this.nomAvion = nomAvion;
	}

	public String getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(String typeAvion) {
		this.typeAvion = typeAvion;
	}

	@Override
	public String toString() {
		return (" Avion [ immatriculation = " + immatriculation + " , nomAvion = " + nomAvion + " , typeAvion = " + typeAvion + "]");
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Avion))
			return false;
		Avion other = (Avion) obj;
		if (other.immatriculation == this.immatriculation)
			return true;
		else
			return false;	
	}

	@Override
	public int hashCode() {
		return immatriculation;
	}

}
