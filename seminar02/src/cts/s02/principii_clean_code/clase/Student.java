package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected Integer anStudii;
	public static Integer sumaFinantata;
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumiriProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii;
	}
	public void afisareFinantare() {
		int s=20;
		System.out.println("Studentul "+super.getNume()+" "+super.getPrenume()+" primeste "+ Student.sumaFinantata +" Euro/zi in proiect.");
	}
	
}
