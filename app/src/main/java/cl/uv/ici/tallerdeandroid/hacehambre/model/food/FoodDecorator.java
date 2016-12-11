package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;
import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchaseDecorator;

public class FoodDecorator extends IPurchaseDecorator implements IFood, Serializable {

    private String name;
    private int cost;
    private int weight;
    private String type;

    public FoodDecorator(String name, int cost, String type, IPurchase decoratedCombo){
        super(decoratedCombo);
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public FoodDecorator(String name, int cost, int weight, String type, IPurchase decoratedCombo) {
        super(decoratedCombo);
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

}