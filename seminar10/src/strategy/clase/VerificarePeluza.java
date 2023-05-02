package strategy.clase;

import strategy.clase.Spectator;

public class VerificarePeluza implements Strategy{
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " este verificat pt intrarea in cadrul peluzei.");
    }
}
