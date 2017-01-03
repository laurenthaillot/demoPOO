package co.simplon.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdresseTest {

	@Test
	public void adresses_identiques_en_memoire_sont_equals() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = adresse1;
		
		boolean comparaison =adresse1.equals(adresse2);
				
		assertTrue(comparaison);
	}	
		
	@Test	
	public void si_adresses_distinctes_en_memoire_mais_identiques_alors_equals_true() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertTrue(comparaison);
				
	}
	
	@Test
	public void si_adresse_differentes_ne_sont_pas_egales_equals_false(){
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = new Adresse(5, "rue des primeveres", 92100, "Courbevoie");
	
		boolean comparaison =adresse1.equals(adresse2);
		
		assertFalse(comparaison);
		
	}
	
	@Test
	public void comparaison_adresse_non_null_avec_adresse_null_equals_false(){
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = null;
		
		boolean comparaison =adresse1.equals(adresse2);
		
		assertFalse(comparaison);
	}
	


}


