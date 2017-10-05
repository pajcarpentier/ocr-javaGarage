package vehiculeDefinition;

import java.io.Serializable;

abstract class Moteur implements Serializable{
	// propriétés 
	protected TypeMoteur type;
	private String cylindre;
	private double prix;  

	// Getteurs 
	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}
	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	
	//Constructeur 
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	// methodes 
	public String toString() {
		return "Moteur " + getType() + " "
			+ getCylindre() + " (" + getPrix() + ")";
	}
}
