package pe.isa.evalua.spring5.entity;

import java.util.ArrayList;

public class CELostPetComment {
	private int _id;
	private CELostPet lostPet;
	private CEUser user;
	private String description;
	private ArrayList<LostPetLocation> locations;
	private int status;

	public CELostPetComment() {
		super();
	}

	public CELostPetComment(int _id, CELostPet lostPet, CEUser user, String description,
			ArrayList<LostPetLocation> locations, int status) {
		super();
		this._id = _id;
		this.lostPet = lostPet;
		this.user = user;
		this.description = description;
		this.locations = locations;
		this.status = status;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public CELostPet getLostPet() {
		return lostPet;
	}

	public void setLostPet(CELostPet lostPet) {
		this.lostPet = lostPet;
	}

	public CEUser getUser() {
		return user;
	}

	public void setUser(CEUser user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<LostPetLocation> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<LostPetLocation> locations) {
		this.locations = locations;
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
		builder.append("CELostPetComment [_id=");
		builder.append(_id);
		builder.append(", lostPet=");
		builder.append(lostPet);
		builder.append(", user=");
		builder.append(user);
		builder.append(", description=");
		builder.append(description);
		builder.append(", locations=");
		builder.append(locations);
		builder.append(", status=");
		builder.append(status);
		builder.append(", get_id()=");
		builder.append(get_id());
		builder.append(", getLostPet()=");
		builder.append(getLostPet());
		builder.append(", getUser()=");
		builder.append(getUser());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getLocations()=");
		builder.append(getLocations());
		builder.append(", getStatus()=");
		builder.append(getStatus());
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
