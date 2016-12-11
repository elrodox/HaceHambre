package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;
import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Bread;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.DessertBase;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.DrinkBase;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Meat;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Vegetal;

public class SuperCombo extends Combo implements ICombo, Serializable {

    private DessertBase dessert;
    private DrinkBase drink;

    public SuperCombo(int id, Vegetal[] vegetales, Meat meat, Bread bread, DessertBase dessert, DrinkBase drink) {
        super(id, vegetales, meat, bread);
        this.dessert = dessert;
        this.drink = drink;
    }

    public DessertBase getDessert() {
        return dessert;
    }

    public DrinkBase getDrink() {
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
