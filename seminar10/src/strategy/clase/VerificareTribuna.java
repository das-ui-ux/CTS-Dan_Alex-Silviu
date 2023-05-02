package strategy.clase;


public class VerificareTribuna implements Strategy{
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " este verificat pt intrarea in tribuna.");
    }
}
