package hr.did.helpdesk.model;

import java.io.Serializable;

public class ZaposlenikOdjel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1849265101327567395L;

	private Integer idZaposlenik;
	private String prezimeIme;
	private String adAccount;
	private Integer idRadnoMjesto;
	private String radnoMjesto;
	private Integer idOdjel;
	private String odjel;
	private Integer idSluzba;
	private String sluzba;
	private Integer idSektor;
	private String sektor;
	private String nadrZaposlOdjel;
	private Integer idZaposlNadr;
	
	public ZaposlenikOdjel(Integer idZaposlenik, String prezimeIme, String adAccount, Integer idRadnoMjesto,
			String radnoMjesto, Integer idOdjel, String odjel, Integer idSluzba, String sluzba, Integer idSektor,
			String sektor, String nadrZaposlOdjel, Integer idZaposlNadr) {
		super();
		this.idZaposlenik = idZaposlenik;
		this.prezimeIme = prezimeIme;
		this.adAccount = adAccount;
		this.idRadnoMjesto = idRadnoMjesto;
		this.radnoMjesto = radnoMjesto;
		this.idOdjel = idOdjel;
		this.odjel = odjel;
		this.idSluzba = idSluzba;
		this.sluzba = sluzba;
		this.idSektor = idSektor;
		this.sektor = sektor;
		this.nadrZaposlOdjel = nadrZaposlOdjel;
		this.idZaposlNadr = idZaposlNadr;
	}

	public Integer getIdZaposlenik() {
		return idZaposlenik;
	}

	public void setIdZaposlenik(Integer idZaposlenik) {
		this.idZaposlenik = idZaposlenik;
	}

	public String getPrezimeIme() {
		return prezimeIme;
	}

	public void setPrezimeIme(String prezimeIme) {
		this.prezimeIme = prezimeIme;
	}

	public String getAdAccount() {
		return adAccount;
	}

	public void setAdAccount(String adAccount) {
		this.adAccount = adAccount;
	}

	public Integer getIdRadnoMjesto() {
		return idRadnoMjesto;
	}

	public void setIdRadnoMjesto(Integer idRadnoMjesto) {
		this.idRadnoMjesto = idRadnoMjesto;
	}

	public String getRadnoMjesto() {
		return radnoMjesto;
	}

	public void setRadnoMjesto(String radnoMjesto) {
		this.radnoMjesto = radnoMjesto;
	}

	public Integer getIdOdjel() {
		return idOdjel;
	}

	public void setIdOdjel(Integer idOdjel) {
		this.idOdjel = idOdjel;
	}

	public String getOdjel() {
		return odjel;
	}

	public void setOdjel(String odjel) {
		this.odjel = odjel;
	}

	public Integer getIdSluzba() {
		return idSluzba;
	}

	public void setIdSluzba(Integer idSluzba) {
		this.idSluzba = idSluzba;
	}

	public String getSluzba() {
		return sluzba;
	}

	public void setSluzba(String sluzba) {
		this.sluzba = sluzba;
	}

	public Integer getIdSektor() {
		return idSektor;
	}

	public void setIdSektor(Integer idSektor) {
		this.idSektor = idSektor;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public String getNadrZaposlOdjel() {
		return nadrZaposlOdjel;
	}

	public void setNadrZaposlOdjel(String nadrZaposlOdjel) {
		this.nadrZaposlOdjel = nadrZaposlOdjel;
	}

	public Integer getIdZaposlNadr() {
		return idZaposlNadr;
	}

	public void setIdZaposlNadr(Integer idZaposlNadr) {
		this.idZaposlNadr = idZaposlNadr;
	}	
}
