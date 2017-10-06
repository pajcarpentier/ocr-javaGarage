package validator;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiculeDefinition.MoteurDiesel;
import vehiculeDefinition.TypeMoteur;

public class MoteurTest {

	private MoteurDiesel moteur = new MoteurDiesel("150 Chevaux",10256D);
	@Test
	public void testGetType() {
		assertEquals(TypeMoteur.DIESEL,moteur.getType());
	}

	@Test
	public void testGetCylindre() {
		assertEquals("150 Chevaux",moteur.getCylindre());
	}

	@Test
	public void testGetPrix() {
		assertEquals(10256D,moteur.getPrix(),0D);
	}

	
	@Test
	public void testToString() {
		assertEquals("Moteur Diesel 150 Chevaux ("+10256D+")",moteur.toString());
	}

}
