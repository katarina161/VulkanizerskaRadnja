package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Sadrzi listu guma i metode za dodavanje nove gume u tu listu i 
 * pronalazenje gume u listi
 * 
 * @author Katarina Novakovic
 * @version 1.0.1
 *
 */
public class VulkanizerskaRadnja {

	/**
	 * Lista guma (objekata klase AutoGuma)
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Vraca listu sa gumama
	 * 
	 * @return Lista guma.
	 */
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}

	/**
	 * Dodaje novu gumu u listu guma.
	 * 
	 * @param a Nova guma koja se dodaje u listu guma.
	 * @throws java.lang.NullPointerException Ako je prosledjena null vrednost.
	 * @throws java.lang.RuntimeException Ako u listi guma vec postoji ista takva guma.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gume u Vulkanizerskoj radnji na osnovu zadatog kriterijuma.
	 * 
	 * @param markaModel Marka i model gume kao kriterijum pretrage.
	 * @return Lista guma ciji marka i model odgovaraju proledjenoj vrednosti ili
	 * null ako je prosledjena null vrednost.
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
