package miniProjet_vehicule;

public class Vehicule {
private int nb_vehicule;
private String genre_vehicule;
private String nationnalite;
private String prop_vehicule;
private String prob_vehicule;
private String scan_vehicule;
public Vehicule(int nb_vehicule, String genre_vehicule, String nationnalite,
		String prop_vehicule, String prob_vehicule, String scan_vehicule) {
	this.nb_vehicule = nb_vehicule;
	this.genre_vehicule = genre_vehicule;
	this.nationnalite = nationnalite;
	this.prop_vehicule = prop_vehicule;
	this.prob_vehicule = prob_vehicule;
	this.scan_vehicule = scan_vehicule;
}
public int getNb_vehicule() {
	return nb_vehicule;
}
public void setNb_vehicule(int nb_vehicule) {
	this.nb_vehicule = nb_vehicule;
}
public String getGenre_vehicule() {
	return genre_vehicule;
}
public void setGenre_vehicule(String genre_vehicule) {
	this.genre_vehicule = genre_vehicule;
}
public String getNationnalite() {
	return nationnalite;
}
public void setNationnalite(String nationnalite) {
	this.nationnalite = nationnalite;
}
public String getProp_vehicule() {
	return prop_vehicule;
}
public void setProp_vehicule(String prop_vehicule) {
	this.prop_vehicule = prop_vehicule;
}
public String getProb_vehicule() {
	return prob_vehicule;
}
public void setProb_vehicule(String prob_vehicule) {
	this.prob_vehicule = prob_vehicule;
}
public String getScan_vehicule() {
	return scan_vehicule;
}
public void setScan_vehicule(String scan_vehicule) {
	this.scan_vehicule = scan_vehicule;
}
public Vehicule(){
	
}
}
