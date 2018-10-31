package hr.did.helpdesk.model;

import java.io.Serializable;

public class Hitnost implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9162923968384841187L;

	private Integer idHitnost;
	private String naziv;
	
	public Hitnost(Integer idHitnost, String naziv) {
		super();
		this.idHitnost = idHitnost;
		this.naziv = naziv;
	}

	public Integer getIdHitnost() {
		return idHitnost;
	}

	public void setIdHitnost(Integer idHitnost) {
		this.idHitnost = idHitnost;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
}
