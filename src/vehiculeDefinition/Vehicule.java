package vehiculeDefinition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import vehiculeOption.Option;

public abstract class Vehicule implements Serializable{
	// propriétés 
	private String nom;
	private List<Option> options;
	private Marque nomMarque;
	private Moteur moteur;
	private double prix;
	
	// Getteurs
	/**
	 * @return the moteur
	 */
	public Moteur getMoteur() {
		return moteur;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the options
	 */
	public List<Option> getOptions() {
		return options;
	}
	/**
	 * @return the nomMarque
	 */
	public Marque getNomMarque() {
		return nomMarque;
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
		this.prix = this.getPrix() + opt.getPrix();
	}

	//Setteurs
	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
		this.prix = this.getPrix() + moteur.getPrix();
	}

	
	//Méthodes
	public String toString() {
		String result = new String("");
		result = "Voiture " 
			+ getNomMarque().toString()
			+ " : "
			+ getNom() + " "
			+ getMoteur().toString() + " "
			+ "[";
			//liste les options du véhicule et leur prix
		for (Option opt : options) {
			result = result + opt.toString();
		}
		result = result
			+ "]"
			+ " d'une valeur totale de "
			+ getPrix() + " €";
		
		return result;
	}
	
	//Constructeur
	public Vehicule() {
		prix = 0d;
		nom = new String("");
		options = new ArrayList<Option>();
		
	}
	
}
