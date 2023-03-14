package singletoneRegistryNerecomandat;

import java.util.HashMap;
import java.util.Map;

//-acest tip de singletone este nerecomandat pt ca avem clase separate/ lucram in clase separate
// si pt ca poate oricine sa intervina si sa nu mai fie sigura unicitatea
public class Registru {

    private static Map<String, Firma> firmeInregistrate = new HashMap<>();

    public static synchronized Firma getFirma(String denumireFirma){ //    synchronized - e pt thrade safe
        if(!firmeInregistrate.containsKey(denumireFirma)){
            Firma firma = new Firma(denumireFirma, 0);
            firmeInregistrate.put(denumireFirma, firma);
        }
        return firmeInregistrate.get(denumireFirma);
    }

}
