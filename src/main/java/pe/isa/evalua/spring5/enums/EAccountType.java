package pe.isa.evalua.spring5.enums;

public enum EAccountType {
	GOOGLE("google"),
	FACEBOOK("facebook"),
	TWITTER("twitter"),
	INSTAGRAM("instagram"),
	NORMAL("normal");
	EAccountType(String description){
		this.description = description;
	}
	private String description;
	public String getDescription() {
		return this.description;
	}
}
