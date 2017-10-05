package vehiculeDefinition;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, double prix) {
		// TODO Auto-generated constructor stub
		super(cylindre, prix);
		this.type = TypeMoteur.DIESEL;
	}

}
