package pe.isa.evalua.spring5.entity;

import pe.isa.evalua.spring5.enums.EAction;
import pe.isa.evalua.spring5.enums.EModel;

public class CEUserActivity {
	private int _id;
	private CEUser user;
	private String model;
	private String doc;
    private String action;
    private String description;
    private int status;
	public CEUserActivity() {
		super();
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public CEUser getUser() {
		return user;
	}
	public void setUser(CEUser user) {
		this.user = user;
	}
	public String getModel() {
		return model;
	}
	public void setModel(EModel model) {
		this.model = model.getDescription();
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getAction() {
		return action;
	}
	public void setAction(EAction action) {
		this.action = action.getDescription();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		builder.append("CEUserActivity [_id=");
		builder.append(_id);
		builder.append(", user=");
		builder.append(user);
		builder.append(", model=");
		builder.append(model);
		builder.append(", doc=");
		builder.append(doc);
		builder.append(", action=");
		builder.append(action);
		builder.append(", description=");
		builder.append(description);
		builder.append(", status=");
		builder.append(status);
		builder.append(", get_id()=");
		builder.append(get_id());
		builder.append(", getUser()=");
		builder.append(getUser());
		builder.append(", getModel()=");
		builder.append(getModel());
		builder.append(", getDoc()=");
		builder.append(getDoc());
		builder.append(", getAction()=");
		builder.append(getAction());
		builder.append(", getDescription()=");
		builder.append(getDescription());
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
