package cl.uv.ici.tallerdeandroid.hacehambre.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.R;
import cl.uv.ici.tallerdeandroid.hacehambre.dao.FoodDao;
import cl.uv.ici.tallerdeandroid.hacehambre.dao.IDao;
import cl.uv.ici.tallerdeandroid.hacehambre.dao.OrderDao;
import cl.uv.ici.tallerdeandroid.hacehambre.listadapters.ChoseFoodListAdapter;
import cl.uv.ici.tallerdeandroid.hacehambre.listadapters.FoodListAdapter;
import cl.uv.ici.tallerdeandroid.hacehambre.model.combo.ComboDirector;
import cl.uv.ici.tallerdeandroid.hacehambre.model.combo.ICombo;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;
import cl.uv.ici.tallerdeandroid.hacehambre.model.order.Order;
import cl.uv.ici.tallerdeandroid.hacehambre.model.user.UserFactory;

public class PurchaseFoodActivity extends AppCompatActivity implements OnClickListener{

    private ListView foodListView;
    private final ArrayList<IFood> choseFoods = new ArrayList<>();
    private ArrayAdapter choseFoodListAdapter;
    private RadioButton drinkCombo_radioButton;
    private RadioButton dessertCombo_radioButton;
    ICombo combo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_food_list);

        foodListView = (ListView) findViewById(R.id.listViewFood);
        drinkCombo_radioButton = (RadioButton) findViewById(R.id.drinkCombo_radioButton);
        dessertCombo_radioButton = (RadioButton) findViewById(R.id.dessertCombo_radioButton);
        ListView choseFoodListView = (ListView) findViewById(R.id.listViewChoseFood);
        Button purchaseButton = (Button) findViewById(R.id.button_purchase);
        Button cancelButton = (Button) findViewById(R.id.button_cancel);
        purchaseButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);

        IDao<IFood> foodDao = FoodDao.getInstance();
        foodListView.setAdapter( new FoodListAdapter(this, foodDao.findAll()) );

        choseFoodListAdapter = new ChoseFoodListAdapter(getBaseContext(), choseFoods);

        choseFoodListView.setAdapter( choseFoodListAdapter );

        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                       long id) {
                IFood choseFood = (IFood) parent.getItemAtPosition(position);
                choseFoodListAdapter.add(choseFood);
//                combo.addFood(choseFood);
                refreshTotalCost();
            }
        });

        choseFoodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                IFood choseFood = (IFood) parent.getItemAtPosition(position);
                choseFoodListAdapter.remove(choseFood);
//                combo.removeFood(choseFood);
                refreshTotalCost();
            }
        });

        drinkCombo_radioButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dessertCombo_radioButton.setChecked(false);
                refreshTotalCost();
            }
        });
        dessertCombo_radioButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkCombo_radioButton.setChecked(false);
                refreshTotalCost();
            }
        });

        combo = ComboDirector.getDrinkComboBuilder().build();
        refreshTotalCost();
    }

    public void refreshTotalCost(){
        if(drinkCombo_radioButton.isChecked()){
            combo = ComboDirector.getDrinkComboBuilder().build();
        }else if(dessertCombo_radioButton.isChecked()){
            combo = ComboDirector.getDessertComboBuilder().build();
        }
        for(IFood food : choseFoods){
            combo.addFood(food);
        }
        TextView totalCostTextView = (TextView) findViewById(R.id.purchase_textView_costoTotal);
        totalCostTextView.setText(""+combo.getCost());
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button_purchase:
                Order order = new Order(UserFactory.getCurrentUser(), combo);
                OrderDao.getInstance().save(order);
                Toast.makeText(getBaseContext(),"Compra exitosa",Toast.LENGTH_LONG).show();
                super.onBackPressed();
                break;
            case R.id.button_cancel:
                Toast.makeText(getBaseContext(),"Compra cancelada",Toast.LENGTH_LONG).show();
                super.onBackPressed();
                break;
        }
    }

}
