package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Dessert;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class DessertComboBuilder implements IComboBuilder{
    private ICombo combo = null;
    private boolean builded = false;
    @Override
    public ICombo build() {
        builded = true;
        combo = new Combo();
        combo.addFood(new Dessert("Torta", 500, 125, "torta", "29-06-16", 2));
        return combo;
    }

    @Override
    public ICombo getCombo() {
        if(!builded) return build();
        return combo;
    }
}
