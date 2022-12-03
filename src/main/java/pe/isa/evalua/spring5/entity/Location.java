package pe.isa.evalua.spring5.entity;

public class Location {
	private int latitud;
	private int longitud;
	public Location(int latitud, int longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", getLatitud()=");
		builder.append(getLatitud());
		builder.append(", getLongitud()=");
		builder.append(getLongitud());
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
