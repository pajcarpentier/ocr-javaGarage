package vehiculeOption;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 29.9d;
	}

	public String toString() {
		return "Barre de toit (" + getPrix() + ")";
	}
}
