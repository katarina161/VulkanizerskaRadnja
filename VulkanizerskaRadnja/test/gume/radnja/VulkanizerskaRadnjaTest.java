package gume.radnja;

import static org.junit.Assert.fail;

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
	public void testPronadjiGumu() {
		fail("Not yet implemented");
	}

}
