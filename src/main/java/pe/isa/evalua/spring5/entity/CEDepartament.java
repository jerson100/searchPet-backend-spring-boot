package pe.isa.evalua.spring5.entity;

public class CEDepartament {
	private int _id;
	private String name;
	private int status;
	public CEDepartament(int _id, String name, int status) {
		super();
		this._id = _id;
		this.name = name;
		this.status = status;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDepartament [_id=");
		builder.append(_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}
