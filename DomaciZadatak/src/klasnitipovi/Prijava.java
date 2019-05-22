package klasnitipovi;

import java.util.Date;

public class Prijava {

	private int sifraPredmeta;
	private String brojIndeksa;
	private Date datumPolaganja;
	private int ocena;
	
	public Prijava(int sifraPredmeta, String brojIndeksa, Date datumPolaganja, int ocena) {
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.brojIndeksa = brojIndeksa;
		this.datumPolaganja = datumPolaganja;
		this.ocena = ocena;
	}

	public int getSifraPredmeta() {
		return sifraPredmeta;
	}

	public void setSifraPredmeta(int sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public Date getDatumPolaganja() {
		return datumPolaganja;
	}

	public void setDatumPolaganja(Date datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
}
