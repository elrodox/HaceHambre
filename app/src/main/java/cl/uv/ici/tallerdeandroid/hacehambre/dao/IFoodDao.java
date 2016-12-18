package cl.uv.ici.tallerdeandroid.hacehambre.dao;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;

/**
 * Created by Rodolfo on 11/12/2016.
 */
public interface IFoodDao {
    ArrayList<IFood> findAll();
    IFood findById(int id);
    IFood findByName(String name);

//    class Singleton {
//        public static IFoodDao instance(Class<? extends IFoodDao> daoClass) {
//            try {
//                return (IFoodDao) daoClass.getField("ourInstance").get(null);
//            } catch (Exception e){
//                e.printStackTrace();
//                return null;
//            }
//        }
//    }
}
