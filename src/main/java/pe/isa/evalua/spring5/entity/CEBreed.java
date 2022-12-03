package pe.isa.evalua.spring5.entity;

import java.util.ArrayList;

public class CEBreed {
	private int _id;
	private CETypePet typePet;
	private String name;
	private String description;
	private ArrayList<String> characteristics;
	private ArrayList<String> images;
	private int status;
	public CEBreed() {
		super();
	}
	public CEBreed(int _id, CETypePet typePet, String name, String description, ArrayList<String> characteristics,
			ArrayList<String> images, int status) {
		super();
		this._id = _id;
		this.typePet = typePet;
		this.name = name;
		this.description = description;
		this.characteristics = characteristics;
		this.images = images;
		this.status = status;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public CETypePet getTypePet() {
		return typePet;
	}
	public void setTypePet(CETypePet typePet) {
		this.typePet = typePet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(ArrayList<String> characteristics) {
		this.characteristics = characteristics;
	}
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEBreed [_id=");
		builder.append(_id);
		builder.append(", typePet=");
		builder.append(typePet);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", characteristics=");
		builder.append(characteristics);
		builder.append(", images=");
		builder.append(images);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
}
