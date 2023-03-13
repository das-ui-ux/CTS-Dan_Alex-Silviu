package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private Integer clasa;
	private String tutore;
	public static Integer sumaFinantata;
	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumiriProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	public Elev() {
		super();
	}
	public void afisareFinantare() {
		int s=30;
		System.out.println("Elevul "+super.getNume()+" "+super.getPrenume()+" primeste " + Elev.sumaFinantata + " Euro/zi in proiect.");
	}
	
}
