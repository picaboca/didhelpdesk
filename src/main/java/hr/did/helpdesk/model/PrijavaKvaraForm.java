package hr.did.helpdesk.model;

public class PrijavaKvaraForm {

	private Kategorija kategorija;
	private Zaposlenik zaposlenik;
	private String nazivPrijave;
	private String opisPrijave;
	private Hitnost hitnost;
	public Kategorija getKategorija() {
		return kategorija;
	}
	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}
	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}
	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
	public String getNazivPrijave() {
		return nazivPrijave;
	}
	public void setNazivPrijave(String nazivPrijave) {
		this.nazivPrijave = nazivPrijave;
	}
	public String getOpisPrijave() {
		return opisPrijave;
	}
	public void setOpisPrijave(String opisPrijave) {
		this.opisPrijave = opisPrijave;
	}
	public Hitnost getHitnost() {
		return hitnost;
	}
	public void setHitnost(Hitnost hitnost) {
		this.hitnost = hitnost;
	}

	
}
