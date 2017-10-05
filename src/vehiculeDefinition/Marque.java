package vehiculeDefinition;

import java.io.Serializable;

public enum Marque implements Serializable{
	// Enmération et valorisation 
	RENO("Renault"),
	PIGEOT("Peugeot"),
	TROEN("Citroen");
	
	// valorisation de l'enum
	private String marque ="";
	
	//Constructeur privé de l'enum
	Marque(String marque){
		this.marque =marque;
	}
	
	//toString pour afficher la valorisation de l'enum
	public String toString() {
		return marque;
	}
}
