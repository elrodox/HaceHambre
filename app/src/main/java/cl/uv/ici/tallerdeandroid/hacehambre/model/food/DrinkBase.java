package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;

public class DrinkBase extends FoodBase implements Serializable {

    private String unit;


    public DrinkBase(String name, int cost, int weight, String type, String unit) {
        super(name, cost, weight, type);
        this.unit = unit;
    }

    public String getUnit(){
        return unit;
    }
}
