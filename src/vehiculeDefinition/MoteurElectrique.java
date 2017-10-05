package vehiculeDefinition;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, double prix) {
		// TODO Auto-generated constructor stub
		super(cylindre, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}

}
