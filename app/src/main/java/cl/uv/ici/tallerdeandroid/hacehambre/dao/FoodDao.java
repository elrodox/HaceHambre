package cl.uv.ici.tallerdeandroid.hacehambre.dao;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Bread;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Meat;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Vegetal;

/**
 * Created by Rodolfo on 11/12/2016.
 */
public class FoodDao implements IDao<IFood> {


    private static IDao ourInstance = new FoodDao();

    public static IDao getInstance() {
        return ourInstance;
    }

    private FoodDao() {}

    @Override
    public ArrayList<IFood> findAll() {
        ArrayList<IFood> list = new ArrayList();
        list.add(new Bread("Pan Hallulla", 500, 1, "pan", "chile", false));
        list.add(new Bread("Pan Batido", 600, 1, "pan", "chile", false));
        list.add(new Meat("Lomo", 1000, 1, "carne", "chile", 2.5));
        list.add(new Meat("Pollo", 1200, 1, "carne", "chile", 2.5));
        list.add(new Vegetal("Lechuga", 300, 1, "vegetal", "verano"));
        list.add(new Vegetal("Pepino", 200, 1, "vegetal", "verano"));
        list.add(new Vegetal("Repollo", 600, 1, "vegetal", "verano"));

//        String name, int costo, int peso, String tipo, String originCountry, boolean wholemeal, IPurchase decoratedCombo
        return list;
    }

    @Override
    public IFood findById(int id) {
        return null;
    }

    @Override
    public IFood findByName(String name) {
        return null;
    }

    @Override
    public void save(IFood model) {

    }
}
