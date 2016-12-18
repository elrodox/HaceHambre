package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import java.io.Serializable;

public class Drink extends Food implements Serializable {

    private String unit;


    public Drink(String name, int cost, int weight, String type, String unit) {
        super(name, cost, weight, type);
        this.unit = unit;
    }

    public String getUnit(){
        return unit;
    }
}
