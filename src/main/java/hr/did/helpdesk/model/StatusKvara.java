package hr.did.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

public class StatusKvara implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -490188907323382410L;

	private Integer idKvarStatus;
	private Integer idPrijava;
	private Integer idStatus;
	private Integer idIctZaposlenik;
	private Date datumStatusa;
	private String opisRjesenja;
	public StatusKvara(Integer idKvarStatus, Integer idPrijava, Integer idStatus, Integer idIctZaposlenik,
			Date datumStatusa, String opisRjesenja) {
		super();
		this.idKvarStatus = idKvarStatus;
		this.idPrijava = idPrijava;
		this.idStatus = idStatus;
		this.idIctZaposlenik = idIctZaposlenik;
		this.datumStatusa = datumStatusa;
		this.opisRjesenja = opisRjesenja;
	}
	public Integer getIdKvarStatus() {
		return idKvarStatus;
	}
	public void setIdKvarStatus(Integer idKvarStatus) {
		this.idKvarStatus = idKvarStatus;
	}
	public Integer getIdPrijava() {
		return idPrijava;
	}
	public void setIdPrijava(Integer idPrijava) {
		this.idPrijava = idPrijava;
	}
	public Integer getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	public Integer getIdIctZaposlenik() {
		return idIctZaposlenik;
	}
	public void setIdIctZaposlenik(Integer idIctZaposlenik) {
		this.idIctZaposlenik = idIctZaposlenik;
	}
	public Date getDatumStatusa() {
		return datumStatusa;
	}
	public void setDatumStatusa(Date datumStatusa) {
		this.datumStatusa = datumStatusa;
	}
	public String getOpisRjesenja() {
		return opisRjesenja;
	}
	public void setOpisRjesenja(String opisRjesenja) {
		this.opisRjesenja = opisRjesenja;
	}	
	
}
