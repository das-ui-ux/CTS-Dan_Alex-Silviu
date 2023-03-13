package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected Integer varsta;
	protected Integer punctaj;
	protected Integer nrProiecte;
	protected String[] denumiriProiect;
	protected static Integer pragAcceptat = 80;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus(){
		System.out.println("Aplicantul "+this.nume+" "+this.prenume+
				(this.punctaj > Aplicant.pragAcceptat ? " a fost acceptat." : " nu a fost acceptat."));
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNr_proiecte() {
		return nrProiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nrProiecte = nr_proiecte;
	}
	public void setDenumiriProiect(String[] denumiriProiect) {
		this.denumiriProiect = denumiriProiect;
	}
	public abstract void afisareFinantare();
}
