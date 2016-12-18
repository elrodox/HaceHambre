package cl.uv.ici.tallerdeandroid.hacehambre.model.food;


import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;

public class Vegetal extends FoodDecorator implements Serializable{

    private String season;

    public Vegetal(String name, int cost, int weight, String type, String season, IPurchase decoratedCombo){
        super(name, cost, weight, type, decoratedCombo);
        this.season = season;
    }
    public Vegetal(String name, int cost, int weight, String type, String season){
        super(name, cost, weight, type, null);
        this.season = season;
    }
    public String getSeason(){
        return season;
    }

}
