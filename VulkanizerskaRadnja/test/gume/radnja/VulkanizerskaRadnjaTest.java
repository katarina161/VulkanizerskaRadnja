package gume.radnja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja radnja;
	private AutoGuma guma1;
	private AutoGuma guma2;
	private AutoGuma guma3;

	@Before
	public void setUp() throws Exception {
		radnja = new VulkanizerskaRadnja();
		
		guma1 = new AutoGuma();
		guma1.setMarkaModel("Sava - zimske gume");
		guma1.setPrecnik(15);
		guma1.setSirina(200);
		guma1.setVisina(60);
		
		guma2 = new AutoGuma();
		guma2.setMarkaModel("Sava - zimske gume");
		guma2.setPrecnik(17);
		guma2.setSirina(280);
		guma2.setVisina(70);
		
		guma3 = new AutoGuma();
		guma3.setMarkaModel("Michelin - zimske gume");
		guma3.setPrecnik(20);
		guma3.setSirina(340);
		guma3.setVisina(90);
	}

	@After
	public void tearDown() throws Exception {
		radnja = null;
		guma1 = null;
		guma2 = null;
		guma3 = null;
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		radnja.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		radnja.dodajGumu(guma1);
		radnja.dodajGumu(guma1);
	}
	
	@Test
	public void testDodajGumu() {
		radnja.dodajGumu(guma1);
		
		List<AutoGuma> gume = radnja.getGume();
		
		assertTrue(gume.size() == 1);
		assertEquals(guma1, gume.get(0));
	}
	
	@Test
	public void testDodajGumu2() {
		radnja.dodajGumu(guma1);
		radnja.dodajGumu(guma2);
		
		List<AutoGuma> gume = radnja.getGume();
		
		assertTrue(gume.size() == 2);
		assertEquals(guma1, gume.get(1));
		assertEquals(guma2, gume.get(0));
	}

	@Test
	public void testPronadjiGumuNull() {
		List<AutoGuma> rezultat = radnja.pronadjiGumu(null);
		
		assertNull(rezultat);
	}
	
	@Test
	public void testPronadjiGumuNemaUListi() {
		radnja.dodajGumu(guma1);
		radnja.dodajGumu(guma2);
		radnja.dodajGumu(guma3);
		
		List<AutoGuma> rezultat = radnja.pronadjiGumu("Tigar - letnje gume");
		
		assertTrue(rezultat.isEmpty());
	}
	
	@Test
	public void testPronadjiGumuJednaUListi() {
		radnja.dodajGumu(guma1);
		radnja.dodajGumu(guma2);
		radnja.dodajGumu(guma3);
		
		List<AutoGuma> rezultat = radnja.pronadjiGumu("Michelin - zimske gume");
		
		assertTrue(rezultat.size() == 1);
		assertEquals(guma3, rezultat.get(0));
	}
	
	@Test
	public void testPronadjiGumuViseUListi() {
		radnja.dodajGumu(guma1);
		radnja.dodajGumu(guma2);
		radnja.dodajGumu(guma3);
		
		List<AutoGuma> rezultat = radnja.pronadjiGumu("Sava - zimske gume");
		
		assertTrue(rezultat.size() == 2);
		assertEquals(guma2, rezultat.get(0));
		assertEquals(guma1, rezultat.get(1));
	}

}
