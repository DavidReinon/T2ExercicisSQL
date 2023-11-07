package seccio;

import java.time.LocalTime;

public class Cançons {

	private int id;
	private String nom;
	private String artista;
	private String duraçio;
	private int anyo;

	public void setNom(String nombre) {
		nom = nombre;
	}

	public void setArtista(String artist) {
		artista = artist;
	}

	public void setDuraçio(String dur) {
		duraçio = dur;
	}

	public void setAnyo(int any) {
		anyo = any;
	}

	public String getNom() {
		return nom;
	}

	public String getArtista() {
		return artista;
	}

	public String getDuraçio() {
		return duraçio;
	}

	public int getAnyo() {
		return anyo;
	}

	public Cançons() {
		// TODO Auto-generated constructor stub
	}
}
