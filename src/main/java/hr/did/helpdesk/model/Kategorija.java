package hr.did.helpdesk.model;

import java.io.Serializable;

public class Kategorija implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5863885622175609830L;

	private Integer idKategorija;
	private String naziv;
	private Integer nadr;
	public Kategorija(Integer idKategorija, String naziv, Integer nadr) {
		super();
		this.idKategorija = idKategorija;
		this.naziv = naziv;
		this.nadr = nadr;
	}
	public Integer getIdKategorija() {
		return idKategorija;
	}
	public void setIdKategorija(Integer idKategorija) {
		this.idKategorija = idKategorija;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Integer getNadr() {
		return nadr;
	}
	public void setNadr(Integer nadr) {
		this.nadr = nadr;
	}	
	
}
