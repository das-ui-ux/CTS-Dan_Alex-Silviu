package Facade.clase;

import java.util.List;

public class Salon {
    private List<Integer> listaPaturi;

    private Integer numarSalon;

    public Salon(List<Integer> listaPaturi, Integer numarSalon) {
        this.listaPaturi = listaPaturi;
        this.numarSalon = numarSalon;
    }

    public void verificareDisponibilitatePat(Integer idPat){
        if(listaPaturi.get(idPat) != null){
            System.out.println("Patul este disponibil!");
        } else{
            System.out.println("Nu sunt paturi disponibile!");
        }
    }
}
