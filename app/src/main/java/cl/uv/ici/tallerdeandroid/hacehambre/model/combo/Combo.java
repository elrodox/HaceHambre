package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Bread;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Meat;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Vegetal;

public class Combo implements ICombo, Serializable {
    private List<IFood> foods;

    public Combo() {
        foods = new ArrayList<>();
    }

    @Override
    public int getCost() {
        int cost = 0;
        for(IFood food : foods){
            cost += food.getCost();
        }
        return cost;
    }

    @Override
    public List<IFood> getFoods() {
        return foods;
    }

    @Override
    public void addFood(IFood food) {
        foods.add(food);
    }

    @Override
    public void removeFood(IFood food){
        foods.remove(food);
    }
}
