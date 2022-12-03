package pe.isa.evalua.spring5.entity;

public class Characteristics {
	private String size;
	private String eyeColor;
	private String hairColor;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Characteristics [size=");
		builder.append(size);
		builder.append(", eyeColor=");
		builder.append(eyeColor);
		builder.append(", hairColor=");
		builder.append(hairColor);
		builder.append(", getSize()=");
		builder.append(getSize());
		builder.append(", getEyeColor()=");
		builder.append(getEyeColor());
		builder.append(", getHairColor()=");
		builder.append(getHairColor());
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
