package cl.uv.ici.tallerdeandroid.hacehambre.model.food;


import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;

public class Bread extends FoodDecorator implements Serializable {

    private String originCountry;
    private boolean wholemeal;

    public Bread(String name, int costo, int peso, String tipo, String originCountry, boolean wholemeal, IPurchase decoratedCombo){
        super(name, costo, peso, tipo, decoratedCombo);
        this.originCountry = originCountry;
        this.wholemeal = wholemeal;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public boolean isWholemeal() {
        return wholemeal;
    }


}
