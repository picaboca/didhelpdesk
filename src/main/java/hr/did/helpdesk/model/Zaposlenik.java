package hr.did.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

public class Zaposlenik implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8386044479880596734L;
	
	private Integer id;
	private String prezime;
	private String ime;
	private String tip;
	private String matbr;
	private String djev_prezime;
	private String ime_oca;
	private String ulica;
	private String mjesto;
	private String ptt_broj;
	private String jmbg;
	private String oib;
	private Date datum_rodjenja;
	private String spol;
	private String mj_rodjenja;
	private Integer id_radno_mjesto;
	private String username;
	private String password;
	private String os_isk;
	private String telefon;
	private String mobitel;
	private String email;
	private String unio;
	private Date datum_unosa;
	private String promjenio;
	private Date dat_promjene;
	private String strucna_sprema;	
		
	public Zaposlenik(Integer id, String prezime, String ime, String tip, String matbr, String djev_prezime,
			String ime_oca, String ulica, String mjesto, String ptt_broj, String jmbg, String oib, Date datum_rodjenja,
			String spol, String mj_rodjenja, Integer id_radno_mjesto, String username, String password, String os_isk,
			String telefon, String mobitel, String email, String unio, Date datum_unosa, String promjenio,
			Date dat_promjene, String strucna_sprema) {
		super();
		this.id = id;
		this.prezime = prezime;
		this.ime = ime;
		this.tip = tip;
		this.matbr = matbr;
		this.djev_prezime = djev_prezime;
		this.ime_oca = ime_oca;
		this.ulica = ulica;
		this.mjesto = mjesto;
		this.ptt_broj = ptt_broj;
		this.jmbg = jmbg;
		this.oib = oib;
		this.datum_rodjenja = datum_rodjenja;
		this.spol = spol;
		this.mj_rodjenja = mj_rodjenja;
		this.id_radno_mjesto = id_radno_mjesto;
		this.username = username;
		this.password = password;
		this.os_isk = os_isk;
		this.telefon = telefon;
		this.mobitel = mobitel;
		this.email = email;
		this.unio = unio;
		this.datum_unosa = datum_unosa;
		this.promjenio = promjenio;
		this.dat_promjene = dat_promjene;
		this.strucna_sprema = strucna_sprema;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getMatbr() {
		return matbr;
	}
	public void setMatbr(String matbr) {
		this.matbr = matbr;
	}
	public String getDjev_prezime() {
		return djev_prezime;
	}
	public void setDjev_prezime(String djev_prezime) {
		this.djev_prezime = djev_prezime;
	}
	public String getIme_oca() {
		return ime_oca;
	}
	public void setIme_oca(String ime_oca) {
		this.ime_oca = ime_oca;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getMjesto() {
		return mjesto;
	}
	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}
	public String getPtt_broj() {
		return ptt_broj;
	}
	public void setPtt_broj(String ptt_broj) {
		this.ptt_broj = ptt_broj;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}
	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public String getSpol() {
		return spol;
	}
	public void setSpol(String spol) {
		this.spol = spol;
	}
	public String getMj_rodjenja() {
		return mj_rodjenja;
	}
	public void setMj_rodjenja(String mj_rodjenja) {
		this.mj_rodjenja = mj_rodjenja;
	}
	public Integer getId_radno_mjesto() {
		return id_radno_mjesto;
	}
	public void setId_radno_mjesto(Integer id_radno_mjesto) {
		this.id_radno_mjesto = id_radno_mjesto;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOs_isk() {
		return os_isk;
	}
	public void setOs_isk(String os_isk) {
		this.os_isk = os_isk;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMobitel() {
		return mobitel;
	}
	public void setMobitel(String mobitel) {
		this.mobitel = mobitel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUnio() {
		return unio;
	}
	public void setUnio(String unio) {
		this.unio = unio;
	}
	public Date getDatum_unosa() {
		return datum_unosa;
	}
	public void setDatum_unosa(Date datum_unosa) {
		this.datum_unosa = datum_unosa;
	}
	public String getPromjenio() {
		return promjenio;
	}
	public void setPromjenio(String promjenio) {
		this.promjenio = promjenio;
	}
	public Date getDat_promjene() {
		return dat_promjene;
	}
	public void setDat_promjene(Date dat_promjene) {
		this.dat_promjene = dat_promjene;
	}
	public String getStrucna_sprema() {
		return strucna_sprema;
	}
	public void setStrucna_sprema(String strucna_sprema) {
		this.strucna_sprema = strucna_sprema;
	}	
}
