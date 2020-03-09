package gume;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {
	
	private AutoGuma guma;

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOd3() {
		guma.setMarkaModel("As");
	}
	
	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("Sava - letnje gume");
		
		assertEquals("Sava - letnje gume", guma.getMarkaModel());
	}

	@Test
	public void testSetPrecnik() {
		guma.setPrecnik(15);
		
		assertEquals(15, guma.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		guma.setPrecnik(50);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		guma.setPrecnik(5);
	}

	@Test
	public void testSetSirina() {
		guma.setSirina(200);
		
		assertEquals(200, guma.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		guma.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		guma.setSirina(500);
	}

	@Test
	public void testSetVisina() {
		guma.setVisina(58);
		
		assertEquals(58, guma.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		guma.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		guma.setVisina(96);
	}


	@Test
	public void testToString() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		String s = guma.toString();
		assertTrue(s.contains("Sava - zimske gume"));
		assertTrue(s.contains("20"));
		assertTrue(s.contains("150"));
		assertTrue(s.contains("45"));
	}

	@Test
	public void testEqualsObjectNull() {
		assertFalse(guma.equals(null));
	}
	
	@Test
	public void testEqualsObjectDrugaKlasa() {
		assertFalse(guma.equals(new Object()));
	}
	
	@Test
	public void testEqualsObjectNisuIsti() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava - letnje gume");
		g2.setPrecnik(21);
		g2.setSirina(160);
		g2.setVisina(80);
		
		assertFalse(guma.equals(g2));
	}
	
	@Test
	public void testEqualsObjectNijeIstaMarkaModel() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin - letnje gume");
		g2.setPrecnik(20);
		g2.setSirina(150);
		g2.setVisina(45);
		
		assertFalse(guma.equals(g2));
	}
	
	@Test
	public void testEqualsObjectNijeIstiPrecnik() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava - zimske gume");
		g2.setPrecnik(21);
		g2.setSirina(150);
		g2.setVisina(45);
		
		assertFalse(guma.equals(g2));
	}
	
	@Test
	public void testEqualsObjectNijeIstaSirina() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava - zimske gume");
		g2.setPrecnik(20);
		g2.setSirina(160);
		g2.setVisina(45);
		
		assertFalse(guma.equals(g2));
	}
	
	@Test
	public void testEqualsObjectNijeIstaVisina() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava - zimske gume");
		g2.setPrecnik(20);
		g2.setSirina(150);
		g2.setVisina(80);
		
		assertFalse(guma.equals(g2));
	}
	
	@Test
	public void testEqualsObjectIstiSu() {
		guma.setMarkaModel("Sava - zimske gume");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(45);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava - zimske gume");
		g2.setPrecnik(20);
		g2.setSirina(150);
		g2.setVisina(45);
		
		assertTrue(guma.equals(g2));
	}

}
