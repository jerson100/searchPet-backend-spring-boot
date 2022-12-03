package pe.isa.evalua.spring5.entity;

import java.util.Date;

import pe.isa.evalua.spring5.enums.EAccountType;

public class CEUser {

	private int _id;
	private String name;
	private String paternalSurname;
	private String maternalSurname;
    private Date birthday;
    private String username;
    private String password;
    private String email;
    private String address;
    private Location location;
    private CEDistrict district;
    private SocialNetWork socialNetWorks;
    private String urlImageProfile;
    private int status;
    private CETypeUser typeUser;
    private String accountType;
	public CEUser() {
		super();
	}
	public CEUser(int _id, String name, String paternalSurname, String maternalSurname, Date birthday, String username,
			String password, String email, String address, Location location, CEDistrict district,
			SocialNetWork socialNetWorks, String urlImageProfile, int status, CETypeUser typeUser,EAccountType  accountType) {
		super();
		this._id = _id;
		this.name = name;
		this.paternalSurname = paternalSurname;
		this.maternalSurname = maternalSurname;
		this.birthday = birthday;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.location = location;
		this.district = district;
		this.socialNetWorks = socialNetWorks;
		this.urlImageProfile = urlImageProfile;
		this.status = status;
		this.typeUser = typeUser;
		this.accountType = accountType.getDescription();
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaternalSurname() {
		return paternalSurname;
	}
	public void setPaternalSurname(String paternalSurname) {
		this.paternalSurname = paternalSurname;
	}
	public String getMaternalSurname() {
		return maternalSurname;
	}
	public void setMaternalSurname(String maternalSurname) {
		this.maternalSurname = maternalSurname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public CEDistrict getDistrict() {
		return district;
	}
	public void setDistrict(CEDistrict district) {
		this.district = district;
	}
	public SocialNetWork getSocialNetWorks() {
		return socialNetWorks;
	}
	public void setSocialNetWorks(SocialNetWork socialNetWorks) {
		this.socialNetWorks = socialNetWorks;
	}
	public String getUrlImageProfile() {
		return urlImageProfile;
	}
	public void setUrlImageProfile(String urlImageProfile) {
		this.urlImageProfile = urlImageProfile;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public CETypeUser getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(CETypeUser typeUser) {
		this.typeUser = typeUser;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(EAccountType accountType) {
		this.accountType = accountType.getDescription();
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEUser [_id=");
		builder.append(_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", paternalSurname=");
		builder.append(paternalSurname);
		builder.append(", maternalSurname=");
		builder.append(maternalSurname);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append(", address=");
		builder.append(address);
		builder.append(", location=");
		builder.append(location);
		builder.append(", district=");
		builder.append(district);
		builder.append(", socialNetWorks=");
		builder.append(socialNetWorks);
		builder.append(", urlImageProfile=");
		builder.append(urlImageProfile);
		builder.append(", status=");
		builder.append(status);
		builder.append(", typeUser=");
		builder.append(typeUser);
		builder.append(", accountType=");
		builder.append(accountType);
		builder.append("]");
		return builder.toString();
	}
    
}
