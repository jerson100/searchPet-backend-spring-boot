package pe.isa.evalua.spring5.entity;

public class CEProvince {
	private int _id;
	private String name;
	private CEDepartament departament;
	private int status;
	
	public CEProvince() {
		super();
	}
	public CEProvince(int _id, String name, CEDepartament departament, int status) {
		super();
		this._id = _id;
		this.name = name;
		this.departament = departament;
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
	public CEDepartament getDepartament() {
		return departament;
	}
	public void setDepartament(CEDepartament departament) {
		this.departament = departament;
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
		builder.append("CEProvince [_id=");
		builder.append(_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", departament=");
		builder.append(departament);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}
