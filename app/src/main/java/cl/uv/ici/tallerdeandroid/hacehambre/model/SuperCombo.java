package cl.uv.ici.tallerdeandroid.hacehambre.model;
import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.interfaces.ICombo;

public class SuperCombo extends Combo implements ICombo, Serializable {

    private Dessert dessert;
    private Drink drink;

    public SuperCombo(int id, Vegetal[] vegetales, Meat meat, Bread bread, Dessert dessert, Drink drink) {
        super(id, vegetales, meat, bread);
        this.dessert = dessert;
        this.drink = drink;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String getComboComponents(){
        return getComboComponents().replaceAll("Combo","Super Combo")+" + "+getDrink().getName()+" + "+getDessert().getName();
    }

    @Override
    public int calculateCost() {
        return super.calculateCost() + getDrink().getCost() + (int)(getDessert().getCost() * 0.75);
    }
}
