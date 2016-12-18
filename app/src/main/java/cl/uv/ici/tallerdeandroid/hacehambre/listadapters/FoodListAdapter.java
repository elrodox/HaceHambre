package cl.uv.ici.tallerdeandroid.hacehambre.listadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import cl.uv.ici.tallerdeandroid.hacehambre.R;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;

/**
 * Created by Rodolfo on 11/12/2016.
 */
public class FoodListAdapter extends ArrayAdapter<IFood> implements ListAdapter {

    private Context context;
    private ArrayList<IFood> foods;

    public FoodListAdapter(Context context, ArrayList<IFood> foods) {
        super(context, 0, foods);
        this.context = context;
        this.foods = foods;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = LayoutInflater.from(context).inflate(R.layout.purchase_food_row, parent, false);
        IFood food = getItem(position);

        TextView textView = (TextView) row.findViewById(R.id.rowFood_textView_foodName);
        textView.setText(food.getName());

        textView = (TextView) row.findViewById(R.id.rowFood_textView_foodCost);
        textView.setText("$"+food.getCost());

        return row;
    }

}