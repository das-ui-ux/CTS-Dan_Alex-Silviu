package strategy.main;

import strategy.clase.*;

// Sportiv: problema 11 - stategy (Design pattern comportamental)
public class Main {
    public static void main(String[] args) {
        Jandarm jandarm = new Jandarm("Ion");
        Spectator s1 = new Spectator("Vasile");
        Spectator s2 = new Spectator("Cornel");
        Spectator s3 = new Spectator("Marcel");

        jandarm.verificaSpectator(s1);
        jandarm.setModVerificare(new VerificareVIP());

        jandarm.verificaSpectator(s2);
        jandarm.setModVerificare(new VerificareTribuna());

        jandarm.verificaSpectator(s3);

    }
}