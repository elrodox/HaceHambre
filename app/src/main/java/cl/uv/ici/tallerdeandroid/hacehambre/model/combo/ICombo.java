package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

import java.util.List;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;

/**
 * Created by Rodolfo on 14/11/2016.
 */
public interface ICombo {
    int getCost();
    List<IFood> getFoods();
    void addFood(IFood food);
    void removeFood(IFood choseFood);
}
