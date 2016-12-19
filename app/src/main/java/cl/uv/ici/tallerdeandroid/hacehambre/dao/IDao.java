package cl.uv.ici.tallerdeandroid.hacehambre.dao;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;

/**
 * Created by Rodolfo on 11/12/2016.
 */
public interface IDao<T> {
    ArrayList<T> findAll();
    T findById(int id);
    T findByName(String name);
    void save(T model);

//    class Singleton {
//        public static IDao instance(Class<? extends IDao> daoClass) {
//            try {
//                return (IDao) daoClass.getField("ourInstance").get(null);
//            } catch (Exception e){
//                e.printStackTrace();
//                return null;
//            }
//        }
//    }
}
