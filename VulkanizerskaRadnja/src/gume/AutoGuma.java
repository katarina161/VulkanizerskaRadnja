package gume;

/**
 * Klasa sadrzi marku i model gume, dimenzije gume (precnik, sirina, visina), 
 * get i set metode, toString i equals metode.
 * 
 * @author Katarina Novakovic
 * @version 1.0.0
 */
public class AutoGuma {
	
	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	
	/**
	 * precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * visina gume
	 */
	private int visina = 0;

	/**
	 * Vraca marku i model gume.
	 * 
	 * @return String koji predstavlja marku i model gume.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost atributa markaModel.
	 * 
	 * @param markaModel Nova vrednost atributa markaModel.
	 * 
	 * @throws java.lang.RuntimeException Ako je:
	 * <ul>
	 * 	<li> prosledjena null vrednost ili
	 * 	<li> duzina prosledjenog stringa je manja od 3
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca precnik gume.
	 * 
	 * @return Precnik gume.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost atributa precnik.
	 * 
	 * @param precnik Nova vrednost atributa precnik.
	 * 
	 * @throws java.lang.RuntimeException Ako je:
	 * <ul>
	 * 	<li> precnik manji od 13 ili
	 * 	<li> precnik veci od 22
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume.
	 * 
	 * @return Sirina gume.
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja vrednost atributa sirina.
	 * 
	 * @param sirina Nova vrednost atributa sirina.
	 * 
	 * @throws java.lang.RuntimeException Ako je:
	 * <ul>
	 * 	<li> sirina manja od 135 ili
	 * 	<li> sirina veca od 355
	 * </ul> 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume.
	 * 
	 * @return Visina gume.
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja vrednost atributa visina.
	 * 
	 * @param visina Nova vrednost atributa visina.
	 * 
	 * @throws java.lang.RuntimeException Ako je:
	 * <ul>
	 * 	<li> visina manja od 25 ili
	 * 	<li> visina veca od 95
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca prezentaciju klase preko stringa.
	 * 
	 * @return String koji sadrzi naziv klase, kao i nazive i 
	 * vrednosti svih atributa klase.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dva objekta jednaka na osnovu svih atributa.
	 * 
	 * @return Vraca <b>true</b> ako su ti objekti instance klase AutoGuma i
	 * ako su jednaki po svim atributima, u suprotnom vraca <b>false</b>.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
