package pe.isa.evalua.spring5.entity;

public class SocialNetWork { 
	private String facebook;
	private String twitter;
	private String instagram;
	private String whatsapp;
	
	public SocialNetWork() {}
	
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SocialNetWork [facebook=");
		builder.append(facebook);
		builder.append(", twitter=");
		builder.append(twitter);
		builder.append(", instagram=");
		builder.append(instagram);
		builder.append(", whatsapp=");
		builder.append(whatsapp);
		builder.append("]");
		return builder.toString();
	}
	
}
