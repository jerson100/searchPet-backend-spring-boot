package pe.isa.evalua.spring5.enums;

public enum EAction {
	CREATE("c"),UPDATE("u"),DELETE("d");
	EAction(String description){
		this.description = description;
	}
	private String description;
	public String getDescription() {
		return this.description;
	}
}
