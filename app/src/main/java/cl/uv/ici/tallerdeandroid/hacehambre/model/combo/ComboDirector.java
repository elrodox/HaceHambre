package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class ComboDirector {
//    private IComboBuilder comboBuilder;

    public static IComboBuilder getDrinkComboBuilder(){
        return new DrinkComboBuilder();
    }

    public static IComboBuilder getDessertComboBuilder(){
        return new DessertComboBuilder();
    }
}
