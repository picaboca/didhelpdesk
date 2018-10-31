package hr.did.helpdesk.model;

import java.io.Serializable;

public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1056273639976264790L;

	private Integer idStatus;
	private String naziv;
	
	public Status(Integer idStatus, String naziv) {
		super();
		this.idStatus = idStatus;
		this.naziv = naziv;
	}

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
}
