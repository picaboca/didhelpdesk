package hr.did.helpdesk.model;

import java.io.Serializable;

public class TipOpreme implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1293046762019392946L;

	private Integer idTip;
	private String naziv;
	
	public TipOpreme(Integer idTip, String naziv) {
		super();
		this.idTip = idTip;
		this.naziv = naziv;
	}

	public Integer getIdTip() {
		return idTip;
	}

	public void setIdTip(Integer idTip) {
		this.idTip = idTip;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}	
}
