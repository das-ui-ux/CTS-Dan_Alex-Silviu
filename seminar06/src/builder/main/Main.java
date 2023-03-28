package builder.main;

import builder.model.PacientBuilder;
import builder.model.IBuilder;
import builder.model.Pacient;
import builder.model.PacientBuilderV2;

public class Main {
    public static void main(String[] args) {

        IBuilder builderPacient = new PacientBuilder();
        Pacient pacient1;
        Pacient pacient2;
//        pacient1 = builderPacient.setNumePacient("Mihxai").setHalat(true).setMicDejunInclus(true).build();
//        pacient2 = builderPacient.setNumePacient("Georgescu").setHalat(false).setMicDejunInclus(true).build();
//        System.out.println(pacient1.toString());
//        System.out.println(pacient2.toString());

        IBuilder  builderPacient2 = new PacientBuilderV2("Das");
        Pacient pacient3 = builderPacient2.setNumePacient("Gigi").setMicDejunInclus(true).build();
        Pacient pacient4 = builderPacient2.setNumePacient("Vlad").build();
        System.out.println(pacient3);
        System.out.println(pacient4);


    }
}