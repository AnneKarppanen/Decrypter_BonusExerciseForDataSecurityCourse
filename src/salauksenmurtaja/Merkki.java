package salauksenmurtaja;

public class Merkki {
	
	private char merkki;
	private char merkitys; 
	private int maara; 
	private double frekvenssi;
	
	public Merkki(char merkki) {
		this.merkki = merkki;
	}
	
	public char getMerkitys() {
		return merkitys;
	}
	public void setMerkitys(char merkitys) {
		this.merkitys = merkitys;
	}
	public int getMaara() {
		return maara;
	}
	public void setMaara(int maara) {
		this.maara = maara;
	}
	public double getFrekvenssi() {
		return frekvenssi;
	}
	public void setFrekvenssi(double frekvenssi) {
		this.frekvenssi = frekvenssi;
	}
	
	public char getMerkki() {
		return merkki;
	}

	@Override
	public String toString() {
		return "Merkki: " + this.merkki + " maara: " + this.maara + " frekvenssi: " + this.frekvenssi;
	}
	
	

}
