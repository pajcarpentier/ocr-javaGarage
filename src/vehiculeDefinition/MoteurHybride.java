package vehiculeDefinition;

public class MoteurHybride extends Moteur{

	public MoteurHybride(String cylindre, double prix) {
		// TODO Auto-generated constructor stub
		super(cylindre, prix);
		this.type = TypeMoteur.HYBRIDE;
	}

}
