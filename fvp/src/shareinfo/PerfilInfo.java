package shareinfo;

public class PerfilInfo {
	private String username;
	private String password;
	private String izenOsoa;
	private String kalea;
	private String zenbakia;
	private String solairua;
	private String letra;
	private String postaKode;
	private String hiria;
	private String email;
	private String telefonoa;
	
	public PerfilInfo(String pusername, String ppassword, String pizenOsoa, String pkalea, String pzenbakia, String psolairua, String pletra, 
			String ppostaKode, String phiria, String pemail, String ptelefonoa){
		this.username = pusername;
		this.password = ppassword;
		this.izenOsoa = pizenOsoa;
		this.kalea = pkalea;
		this.zenbakia = pzenbakia;
		this.solairua = psolairua;
		this.letra = pletra;
		this.postaKode = ppostaKode;
		this.hiria = phiria;
		this.email = pemail;
		this.telefonoa = ptelefonoa;
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

	public String getIzenOsoa() {
		return izenOsoa;
	}

	public void setIzenOsoa(String izenOsoa) {
		this.izenOsoa = izenOsoa;
	}

	public String getKalea() {
		return kalea;
	}

	public void setKalea(String kalea) {
		this.kalea = kalea;
	}

	public String getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(String zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getSolairua() {
		return solairua;
	}

	public void setSolairua(String solairua) {
		this.solairua = solairua;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getPostaKode() {
		return postaKode;
	}

	public void setPostaKode(String postaKode) {
		this.postaKode = postaKode;
	}

	public String getHiria() {
		return hiria;
	}

	public void setHiria(String hiria) {
		this.hiria = hiria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}
}
