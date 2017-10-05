package vehiculeOption;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 347.3d;
	}

	public String toString() {
		return "Climatisation (" + getPrix() + ")";
	}

}
