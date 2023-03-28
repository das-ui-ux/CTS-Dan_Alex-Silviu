package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype{
    private String numeReteta;
    private Float gramajMedicament;
    private Map<String, Float> solutii;

    public Reteta(String numeReteta, Float gramajMedicament, Map<String, Float> solutii) {
        this.numeReteta = numeReteta;
        this.gramajMedicament = gramajMedicament;
        float suma =0;
        for(Float val : solutii.values()){
            suma += val;
        }
//        if(this.gramajMedicament >= suma - 0.1 && this.gramajMedicament < suma + 0.1) {
        if(this.gramajMedicament == suma) {
            this.solutii = solutii;
        }else{
            throw new IllegalArgumentException("Gramaj gresit");
        }
        this.solutii = new HashMap<String, Float>();
    }

    private Reteta(){
        numeReteta = null;
        gramajMedicament = null;
        solutii = null;
    }

    //aici facem deep copy la toate campurile
    @Override
    public Prototype clonare() {
       Reteta reteta = new Reteta();
       reteta.numeReteta = this.numeReteta;
       reteta.gramajMedicament = this.gramajMedicament;
       reteta.solutii = new HashMap<String, Float>();
       for(String val : this.solutii.keySet()){
           reteta.solutii.put(val, this.solutii.get(val));
       }
       return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                ", solutii=" + solutii +
                '}';
    }
}
