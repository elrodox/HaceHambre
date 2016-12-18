package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import android.util.Log;

import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;

public class FoodBase implements IFood, IPurchase, Serializable {

    private String name;
    private int cost;
    private int weight;
    private String type;

    public FoodBase(String name, int cost, String type){
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public FoodBase(String name, int cost, int weight, String type) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCost(){
        Log.d("getCost", "FoodBase");
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

}
