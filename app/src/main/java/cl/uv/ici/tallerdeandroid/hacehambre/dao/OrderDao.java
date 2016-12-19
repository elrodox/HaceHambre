package cl.uv.ici.tallerdeandroid.hacehambre.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


import cl.uv.ici.tallerdeandroid.hacehambre.App;
import cl.uv.ici.tallerdeandroid.hacehambre.model.order.Order;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class OrderDao implements IDao<Order> {
    private static IDao ourInstance = new OrderDao();

    public static IDao getInstance() {
        return ourInstance;
    }

    private OrderDao() {}

    @Override
    public ArrayList<Order> findAll() {
        ArrayList<Order> list = new ArrayList();

//        try{
//            DataAccessObject.getDao(App.getContext());
//            AssetDatabaseOpenHelper databaseAdmin = new AssetDatabaseOpenHelper(App.getContext());
//            SQLiteDatabase database = databaseAdmin.openDatabase();
//
//            Cursor cursor = DataAccessObject.getDao(App.getContext()).getAllRows();
//            if (cursor.moveToFirst()) {
//                while (!cursor.isAfterLast()) {
//                    Order employee = new Order(
//                            cursor.getInt(cursor.getColumnIndex("id")),
//                            cursor.getString(cursor.getColumnIndex("name")),
//                            cursor.getString(cursor.getColumnIndex("function"))
//                    );
//                    list.add(employee);
//                    cursor.moveToNext();
//                }
//            }
//            database.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }



        return null;
    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public Order findByName(String name) {
        return null;
    }

    @Override
    public void save(Order order) {
        Log.d("Firebase", "Saving order...");

//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
//        reference.setValue("Hello, World!");

        if(order.getId()==-1){
            // insert
        }else if (order.getId()>=0){
            // update
        }
    }
}