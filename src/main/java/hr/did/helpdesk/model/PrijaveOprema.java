package hr.did.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

public class PrijaveOprema implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7405573473059359661L;
		
	private Integer idOprema;
	private String naziv;
	private String opis;
	private String serijskiBroj;
	private String inventarniBroj;
	private Integer idTip;
	private Integer idZaposlenikIctUnio;
	private Date datumUnosa;
	private String idBrojNajma;
	private Integer idZaposlenikIctPromjenio;
	private Date datumPromjene;
	private Integer zadRazd;
	private String imeRacunala;
	
	public PrijaveOprema(Integer idOprema, String naziv, String opis, String serijskiBroj, String inventarniBroj,
			Integer idTip, Integer idZaposlenikIctUnio, Date datumUnosa, String idBrojNajma,
			Integer idZaposlenikIctPromjenio, Date datumPromjene, Integer zadRazd, String imeRacunala) {
		super();
		this.idOprema = idOprema;
		this.naziv = naziv;
		this.opis = opis;
		this.serijskiBroj = serijskiBroj;
		this.inventarniBroj = inventarniBroj;
		this.idTip = idTip;
		this.idZaposlenikIctUnio = idZaposlenikIctUnio;
		this.datumUnosa = datumUnosa;
		this.idBrojNajma = idBrojNajma;
		this.idZaposlenikIctPromjenio = idZaposlenikIctPromjenio;
		this.datumPromjene = datumPromjene;
		this.zadRazd = zadRazd;
		this.imeRacunala = imeRacunala;
	}

	public Integer getIdOprema() {
		return idOprema;
	}

	public void setIdOprema(Integer idOprema) {
		this.idOprema = idOprema;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public String getInventarniBroj() {
		return inventarniBroj;
	}

	public void setInventarniBroj(String inventarniBroj) {
		this.inventarniBroj = inventarniBroj;
	}

	public Integer getIdTip() {
		return idTip;
	}

	public void setIdTip(Integer idTip) {
		this.idTip = idTip;
	}

	public Integer getIdZaposlenikIctUnio() {
		return idZaposlenikIctUnio;
	}

	public void setIdZaposlenikIctUnio(Integer idZaposlenikIctUnio) {
		this.idZaposlenikIctUnio = idZaposlenikIctUnio;
	}

	public Date getDatumUnosa() {
		return datumUnosa;
	}

	public void setDatumUnosa(Date datumUnosa) {
		this.datumUnosa = datumUnosa;
	}

	public String getIdBrojNajma() {
		return idBrojNajma;
	}

	public void setIdBrojNajma(String idBrojNajma) {
		this.idBrojNajma = idBrojNajma;
	}

	public Integer getIdZaposlenikIctPromjenio() {
		return idZaposlenikIctPromjenio;
	}

	public void setIdZaposlenikIctPromjenio(Integer idZaposlenikIctPromjenio) {
		this.idZaposlenikIctPromjenio = idZaposlenikIctPromjenio;
	}

	public Date getDatumPromjene() {
		return datumPromjene;
	}

	public void setDatumPromjene(Date datumPromjene) {
		this.datumPromjene = datumPromjene;
	}

	public Integer getZadRazd() {
		return zadRazd;
	}

	public void setZadRazd(Integer zadRazd) {
		this.zadRazd = zadRazd;
	}

	public String getImeRacunala() {
		return imeRacunala;
	}

	public void setImeRacunala(String imeRacunala) {
		this.imeRacunala = imeRacunala;
	}
	
}
