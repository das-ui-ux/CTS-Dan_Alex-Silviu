package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
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
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus(){
		System.out.println("Aplicantul "+this.nume+" "+this.prenume+
				(this.punctaj > Aplicant.pragAcceptat ? " a fost acceptat." : " nu a fost acceptat."));
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nrProiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nrProiecte = nr_proiecte;
	}

	public String[] getDenumiriProiect() {
		return denumiriProiect;
	}

	public void setDenumiriProiect(String[] denumiriProiect) {
		this.denumiriProiect = denumiriProiect;
	}

	public abstract void afisareFinantare();


}
