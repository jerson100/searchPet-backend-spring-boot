package pe.isa.evalua.spring5.entity;

import java.util.ArrayList;

public class CELostPet {
	private int _id;
	private CEUser user;
	private ArrayList<CEPet> pets;
	private ArrayList<String> images;
    private LostPetLocation location;
    private String description;
    private boolean located;
	private int status;
	public CELostPet() {
		super();
	}
	public CELostPet(int _id, CEUser user, ArrayList<CEPet> pets, ArrayList<String> images, LostPetLocation location,
			String description, boolean located, int status) {
		super();
		this._id = _id;
		this.user = user;
		this.pets = pets;
		this.images = images;
		this.location = location;
		this.description = description;
		this.located = located;
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CELostPet [_id=");
		builder.append(_id);
		builder.append(", user=");
		builder.append(user);
		builder.append(", pets=");
		builder.append(pets);
		builder.append(", images=");
		builder.append(images);
		builder.append(", location=");
		builder.append(location);
		builder.append(", description=");
		builder.append(description);
		builder.append(", located=");
		builder.append(located);
		builder.append(", status=");
		builder.append(status);
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
