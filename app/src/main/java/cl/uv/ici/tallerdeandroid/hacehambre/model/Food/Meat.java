package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;

public class Meat extends FoodDecorator implements Serializable {

    private String origin;
    private double fatIndex;

    public Meat(String name, int cost, int weight, String type, String origin, double fatIndex, IPurchase decoratedCombo){
        super(name, cost, weight, type, decoratedCombo);
        this.origin = origin;
        this.fatIndex = fatIndex;
    }

    public String getOrigin() {
        return origin;
    }

    public double getfatIndex() {
        return fatIndex;
    }



}
