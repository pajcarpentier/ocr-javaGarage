package vehiculeOption;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 113.5d;
	}

	public String toString() {
		return "GPS (" + getPrix() + ")";
	}
	
}
