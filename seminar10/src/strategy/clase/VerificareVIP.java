package strategy.clase;

public class VerificareVIP implements Strategy{
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " este verificat doar pt bilet pt ca este VIP.");
    }
}
