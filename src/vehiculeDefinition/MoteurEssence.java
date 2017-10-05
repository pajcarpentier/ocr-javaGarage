package vehiculeDefinition;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, double prix) {
		// TODO Auto-generated constructor stub
		super(cylindre, prix);
		this.type = TypeMoteur.ESSENCE;
		
	}

}
