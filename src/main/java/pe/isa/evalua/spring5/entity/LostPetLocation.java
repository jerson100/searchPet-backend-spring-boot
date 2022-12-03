package pe.isa.evalua.spring5.entity;

import java.util.Arrays;

public class LostPetLocation {
	private String type;
    private int[] coordinates;
	public LostPetLocation(String type, int[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public LostPetLocation() {
		super();
		this.coordinates = new int[2];
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LostPetLocation [type=");
		builder.append(type);
		builder.append(", coordinates=");
		builder.append(Arrays.toString(coordinates));
		builder.append("]");
		return builder.toString();
	}
    
}
