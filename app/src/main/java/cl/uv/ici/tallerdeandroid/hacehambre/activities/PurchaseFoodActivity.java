package cl.uv.ici.tallerdeandroid.hacehambre.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.R;
import cl.uv.ici.tallerdeandroid.hacehambre.dao.FoodDao;
import cl.uv.ici.tallerdeandroid.hacehambre.dao.IFoodDao;
import cl.uv.ici.tallerdeandroid.hacehambre.listadapters.ChoseFoodListAdapter;
import cl.uv.ici.tallerdeandroid.hacehambre.listadapters.FoodListAdapter;
import cl.uv.ici.tallerdeandroid.hacehambre.model.combo.ComboDirector;
import cl.uv.ici.tallerdeandroid.hacehambre.model.combo.ICombo;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Drink;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;
import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;
import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchaseDecorator;

public class PurchaseFoodActivity extends AppCompatActivity {

    private ListView foodListView;
    private final ArrayList<IFood> choseFoods = new ArrayList<>();
    private ArrayAdapter choseFoodListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_food_list);

        foodListView = (ListView) findViewById(R.id.listViewFood);
        IFoodDao foodDao = FoodDao.getInstance();
        foodListView.setAdapter( new FoodListAdapter(this, foodDao.findAll()) );

        choseFoodListAdapter = new ChoseFoodListAdapter(getBaseContext(), choseFoods);
        ListView choseFoodListView = (ListView) findViewById(R.id.listViewChoseFood);
        choseFoodListView.setAdapter( choseFoodListAdapter );

        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                       long id) {
                IFood choseFood = (IFood) parent.getItemAtPosition(position);
                choseFoodListAdapter.add(choseFood);
                refreshTotalCost();
            }
        });

        choseFoodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                IFood choseFood = (IFood) parent.getItemAtPosition(position);
                choseFoodListAdapter.remove(choseFood);
                refreshTotalCost();
            }
        });

    }

    public void refreshTotalCost(){

        if(choseFoods.isEmpty()){
            TextView totalCostTextView = (TextView) findViewById(R.id.purchase_textView_costoTotal);
            totalCostTextView.setText(""+0);
            return;
        }
        ICombo combo = ComboDirector.getDrinkComboBuilder().getCombo();
        for(IFood food : choseFoods){
            combo.addFood(food);
        }

        TextView totalCostTextView = (TextView) findViewById(R.id.purchase_textView_costoTotal);
        totalCostTextView.setText(""+combo.getCost());

    }


}
