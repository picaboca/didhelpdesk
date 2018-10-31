package hr.did.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

public class PrijavaKvarova implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8790142340109538669L;
	
	private Integer idPrijava;
	private String nazivPrijave;
	private String opisPrijave;
	private Kategorija kategorija;
	private Date datumPrijave;	
	private Integer godina;
	private Hitnost hitnost;
	private Zaposlenik idZaposlenikPrijavio;
	private Zaposlenik idZaposlenikVlasnikRacunala;
	private Integer idStatus;
	private Integer idPromjena;
	
	public PrijavaKvarova(Integer idPrijava, String nazivPrijave, String opisPrijave, Kategorija kategorija,
			Date datumPrijave, Integer godina, Hitnost hitnost, Zaposlenik idZaposlenikPrijavio,
			Zaposlenik idZaposlenikVlasnikRacunala, Integer idStatus, Integer idPromjena) {
		super();
		this.idPrijava = idPrijava;
		this.nazivPrijave = nazivPrijave;
		this.opisPrijave = opisPrijave;
		this.kategorija = kategorija;
		this.datumPrijave = datumPrijave;
		this.godina = godina;
		this.hitnost = hitnost;
		this.idZaposlenikPrijavio = idZaposlenikPrijavio;
		this.idZaposlenikVlasnikRacunala = idZaposlenikVlasnikRacunala;
		this.idStatus = idStatus;
		this.idPromjena = idPromjena;
	}
	
	
/*	public PrijavaKvarova() {
		super();
	}
*/
	public Integer getIdPrijava() {
		return idPrijava;
	}

	public void setIdPrijava(Integer idPrijava) {
		this.idPrijava = idPrijava;
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

	public Kategorija getKategorija() {
		return kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}

	public Date getDatumPrijave() {
		return datumPrijave;
	}

	public void setDatumPrijave(Date datumPrijave) {
		this.datumPrijave = datumPrijave;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public Hitnost getHitnost() {
		return hitnost;
	}

	public void setHitnost(Hitnost hitnost) {
		this.hitnost = hitnost;
	}

	public Zaposlenik getIdZaposlenikPrijavio() {
		return idZaposlenikPrijavio;
	}

	public void setIdZaposlenikPrijavio(Zaposlenik idZaposlenikPrijavio) {
		this.idZaposlenikPrijavio = idZaposlenikPrijavio;
	}

	public Zaposlenik getIdZaposlenikVlasnikRacunala() {
		return idZaposlenikVlasnikRacunala;
	}

	public void setIdZaposlenikVlasnikRacunala(Zaposlenik idZaposlenikVlasnikRacunala) {
		this.idZaposlenikVlasnikRacunala = idZaposlenikVlasnikRacunala;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Integer getIdPromjena() {
		return idPromjena;
	}

	public void setIdPromjena(Integer idPromjena) {
		this.idPromjena = idPromjena;
	}	
	
}
