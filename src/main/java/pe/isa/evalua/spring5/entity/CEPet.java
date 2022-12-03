package pe.isa.evalua.spring5.entity;

import java.util.ArrayList;
import java.util.Date;

public class CEPet {
	
	private int _id;
	private String name;
	private CEUser user;
	private CEBreed breed;
	private String urlImageProfile;
	private String description;
	private ArrayList<String> images;
	private Date dateOfBirth;
	private String size;
	private Characteristics characteristics;
	private int status;

	public CEPet(String name, CEUser user, CEBreed breed, String urlImageProfile, String description,
			ArrayList<String> images, Date dateOfBirth, String size, Characteristics characteristics, int status) {
		this.name = name;
		this.user = user;
		this.breed = breed;
		this.urlImageProfile = urlImageProfile;
		this.description = description;
		this.images = images;
		this.dateOfBirth = dateOfBirth;
		this.size = size;
		this.characteristics = characteristics;
		this.status = status;
	}

	public CEPet() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CEUser getUser() {
		return user;
	}

	public void setUser(CEUser user) {
		this.user = user;
	}

	public CEBreed getBreed() {
		return breed;
	}

	public void setBreed(CEBreed breed) {
		this.breed = breed;
	}

	public String getUrlImageProfile() {
		return urlImageProfile;
	}

	public void setUrlImageProfile(String urlImageProfile) {
		this.urlImageProfile = urlImageProfile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Characteristics getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEPet [_id=");
		builder.append(_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", user=");
		builder.append(user);
		builder.append(", breed=");
		builder.append(breed);
		builder.append(", urlImageProfile=");
		builder.append(urlImageProfile);
		builder.append(", description=");
		builder.append(description);
		builder.append(", images=");
		builder.append(images);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", size=");
		builder.append(size);
		builder.append(", characteristics=");
		builder.append(characteristics);
		builder.append(", status=");
		builder.append(status);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getUser()=");
		builder.append(getUser());
		builder.append(", getBreed()=");
		builder.append(getBreed());
		builder.append(", getUrlImageProfile()=");
		builder.append(getUrlImageProfile());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getImages()=");
		builder.append(getImages());
		builder.append(", getDateOfBirth()=");
		builder.append(getDateOfBirth());
		builder.append(", getSize()=");
		builder.append(getSize());
		builder.append(", getCharacteristics()=");
		builder.append(getCharacteristics());
		builder.append(", getStatus()=");
		builder.append(getStatus());
		builder.append(", get_id()=");
		builder.append(get_id());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	   
	
}
