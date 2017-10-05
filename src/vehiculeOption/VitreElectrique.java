package vehiculeOption;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 212.35d;
	}

	public String toString() {
		return "Vitre electrique (" + getPrix() + ")";
	}
	
}
