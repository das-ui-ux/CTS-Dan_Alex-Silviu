package Facade.clase;

public class Facade {
    Medic medic;
    Pacient pacient;
    Salon salon;

    public Facade(Medic medic, Pacient pacient, Salon salon) {
        this.medic = medic;
        this.pacient = pacient;
        this.salon = salon;
    }

    public void interneazaPacient(int idPat){
        medic.verificareConfirmareMedic();
        pacient.verificareGravitateStarePacienta();
        salon.verificareDisponibilitatePat(idPat);
    }
}
