package pe.isa.evalua.spring5.entity;

public class CETypePet {
	private int _id;
	private String type;
	private int status;
	private String description;
	public CETypePet(int _id, String type, int status, String description) {
		super();
		this._id = _id;
		this.type = type;
		this.status = status;
		this.description = description;
	}
	public CETypePet() {
		super();
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CETypePet [_id=");
		builder.append(_id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", status=");
		builder.append(status);
		builder.append(", description=");
		builder.append(description);
		builder.append(", get_id()=");
		builder.append(get_id());
		builder.append(", getType()=");
		builder.append(getType());
		builder.append(", getStatus()=");
		builder.append(getStatus());
		builder.append(", getDescription()=");
		builder.append(getDescription());
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
