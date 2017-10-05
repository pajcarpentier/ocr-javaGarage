package vehiculeOption;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 562.9d;
	}

	public String toString() {
		return "Siège chauffant (" + getPrix() + ")";
	}
	
}
