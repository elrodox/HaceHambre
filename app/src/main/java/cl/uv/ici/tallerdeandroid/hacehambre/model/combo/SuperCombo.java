//package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;
//import java.io.Serializable;
//
//import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Bread;
//import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Dessert;
//import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Drink;
//import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Meat;
//import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Vegetal;
//
//public class SuperCombo extends Combo implements ICombo, Serializable {
//
//    private Dessert dessert;
//    private Drink drink;
//
//    public SuperCombo(int id, Vegetal[] vegetales, Meat meat, Bread bread, Dessert dessert, Drink drink) {
//        super(id, vegetales, meat, bread);
//        this.dessert = dessert;
//        this.drink = drink;
//    }
//
//    public Dessert getDessert() {
//        return dessert;
//    }
//
//    public Drink getDrink() {
//        return drink;
//    }
//
//    @Override
//    public String getFoods(){
//        return getFoods().replaceAll("Combo","Super Combo")+" + "+getDrink().getName()+" + "+getDessert().getName();
//    }
//
//    @Override
//    public int calculateCost() {
//        return super.calculateCost() + getDrink().getCost() + (int)(getDessert().getCost() * 0.75);
//    }
//}
