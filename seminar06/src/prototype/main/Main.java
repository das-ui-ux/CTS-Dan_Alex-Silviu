package prototype.main;

import prototype.model.Prototype;
import prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]){
        Map<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("sol1", 40.2F); // F - e castul la Flaot
        solutii.put("sol2",59.8F);
        solutii.put("sol3", 100F);
        Reteta reteta1 = new Reteta("Reteta1", 200F, solutii);

        Prototype retetaLaborator = reteta1.clonare();
        Prototype retetaPacienti= reteta1.clonare();
        System.out.println(retetaLaborator.toString());
        System.out.println(retetaPacienti.toString());
    }
}
