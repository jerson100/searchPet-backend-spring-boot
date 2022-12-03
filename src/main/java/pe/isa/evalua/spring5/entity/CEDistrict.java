package pe.isa.evalua.spring5.entity;

public class CEDistrict {
	private int _id;
	private String name;
	private CEProvince province;
	private int status;
	
	public CEDistrict() {
		super();
	}
	public CEDistrict(int _id, String name, CEProvince province, int status) {
		super();
		this._id = _id;
		this.name = name;
		this.province = province;
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
	public CEProvince getProvince() {
		return province;
	}
	public void setProvince(CEProvince province) {
		this.province = province;
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
		builder.append("CEDistrict [_id=");
		builder.append(_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", province=");
		builder.append(province);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
 }
