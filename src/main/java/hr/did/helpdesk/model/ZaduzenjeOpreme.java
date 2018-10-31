package hr.did.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

public class ZaduzenjeOpreme implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7325292939785290252L;

	private Integer idZadOpreme;
	private Integer idOpreme;
	private Integer idZaposlZaduzio;
	private Date datum;
	private String dokumentZadRazd;
	private Integer idZaposlIctZaduzio;
	private String imeRacunala;
	
	public ZaduzenjeOpreme(Integer idZadOpreme, Integer idOpreme, Integer idZaposlZaduzio, Date datum,
			String dokumentZadRazd, Integer idZaposlIctZaduzio, String imeRacunala) {
		super();
		this.idZadOpreme = idZadOpreme;
		this.idOpreme = idOpreme;
		this.idZaposlZaduzio = idZaposlZaduzio;
		this.datum = datum;
		this.dokumentZadRazd = dokumentZadRazd;
		this.idZaposlIctZaduzio = idZaposlIctZaduzio;
		this.imeRacunala = imeRacunala;
	}

	public Integer getIdZadOpreme() {
		return idZadOpreme;
	}

	public void setIdZadOpreme(Integer idZadOpreme) {
		this.idZadOpreme = idZadOpreme;
	}

	public Integer getIdOpreme() {
		return idOpreme;
	}

	public void setIdOpreme(Integer idOpreme) {
		this.idOpreme = idOpreme;
	}

	public Integer getIdZaposlZaduzio() {
		return idZaposlZaduzio;
	}

	public void setIdZaposlZaduzio(Integer idZaposlZaduzio) {
		this.idZaposlZaduzio = idZaposlZaduzio;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getDokumentZadRazd() {
		return dokumentZadRazd;
	}

	public void setDokumentZadRazd(String dokumentZadRazd) {
		this.dokumentZadRazd = dokumentZadRazd;
	}

	public Integer getIdZaposlIctZaduzio() {
		return idZaposlIctZaduzio;
	}

	public void setIdZaposlIctZaduzio(Integer idZaposlIctZaduzio) {
		this.idZaposlIctZaduzio = idZaposlIctZaduzio;
	}

	public String getImeRacunala() {
		return imeRacunala;
	}

	public void setImeRacunala(String imeRacunala) {
		this.imeRacunala = imeRacunala;
	}	
}
