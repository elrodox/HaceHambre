package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Drink;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class DrinkComboBuilder implements IComboBuilder{
    private ICombo combo = null;
    private boolean builded = false;
    @Override
    public ICombo build() {
        builded = true;
        combo = new Combo();
        combo.addFood(new Drink("Coca-Cola Pequeña", 750, 500, "bebida", "cc"));
        return combo;
    }

    @Override
    public ICombo getCombo() {
        if(!builded) return build();
        return combo;
    }
}
