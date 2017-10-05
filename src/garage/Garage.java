package garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import vehiculeDefinition.Vehicule;

import vehiculeDefinition.Vehicule;

public class Garage implements Serializable{
	//propriétés
	private List<Vehicule> voitures;
	
	
	//methodes
	public void addVoiture(Vehicule voiture) {
		voitures.add(voiture);
	}
	
	public String toString() {
		String result = new String();
		for (Vehicule voiture : voitures) {
			result = result + voiture.toString();
		}
		return result;
	}
	
	//constructeur
	public Garage() {
		voitures = new ArrayList<Vehicule>();

	}
}
