package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class ComboDirector {
    private static IComboBuilder drinkComboBuilder;
    private static IComboBuilder drinkDessertBuilder;
    private static IComboBuilder drinkEmptyBuilder;

    public static IComboBuilder getDrinkComboBuilder(){
        if(drinkComboBuilder==null) drinkComboBuilder = new DrinkComboBuilder();
        return drinkComboBuilder;
    }

    public static IComboBuilder getDessertComboBuilder(){
        if(drinkDessertBuilder==null) drinkDessertBuilder = new DessertComboBuilder();
        return drinkDessertBuilder;
    }

    public static IComboBuilder getEmptyComboBuilder(){
        if(drinkEmptyBuilder==null) drinkEmptyBuilder = new EmptyComboBuilder();
        return drinkEmptyBuilder;
    }
}
