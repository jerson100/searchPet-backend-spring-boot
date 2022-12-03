package pe.isa.evalua.spring5.enums;

public enum EModel {
	PET("Pet"),LOSTPET("LostPet"), LOSTPETCOMMENT("LostPetComment");
	EModel(String description){
		this.description = description;
	}
	private String description;
	public String getDescription() {
		return this.description;
	}
}
