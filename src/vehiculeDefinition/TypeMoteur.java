package vehiculeDefinition;

import java.io.Serializable;

public enum TypeMoteur implements Serializable{
	// Enumeration et valorisation
	DIESEL("Diesel"),
	ESSENCE("Essence"),
	HYBRIDE("Hybride"),
	ELECTRIQUE("Electrique");
	
	// valorisation de l'enum
	private String type = "";
	
	// Constructeur privé de l'enum
	TypeMoteur(String type){
		this.type = type;
	}
	
	// toStrng pour afficher la valorisation de l'enum
	public String toString() {
		return type;
	}

}
