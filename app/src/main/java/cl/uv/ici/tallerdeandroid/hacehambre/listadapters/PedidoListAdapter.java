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
import cl.uv.ici.tallerdeandroid.hacehambre.model.Pedido;

/**
 * Created by Rodolfo on 08/12/2016.
 */
public class PedidoListAdapter extends ArrayAdapter<Pedido> implements ListAdapter {

    private Context context;
    private ArrayList<Pedido> pedidos;

    public PedidoListAdapter(Context context, ArrayList<Pedido> pedidos) {
        super(context, 0, pedidos);
        this.context = context;
        this.pedidos = pedidos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = LayoutInflater.from(context).inflate(R.layout.row_pedido, parent, false);
        Pedido pedido = getItem(position);
        TextView name = (TextView) row.findViewById(R.id.rowPedido_textView_pedidoId);
        name.setText(pedido.getId()+": "+pedido.getDate().toString());
        return row;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
//        TextView textView = (TextView) rowView.findViewById(R.id.label);
//        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//        textView.setText(values[position]);
//        // change the icon for Windows and iPhone
//        String s = values[position];
//        if (s.startsWith("iPhone")) {
//            imageView.setImageResource(R.drawable.no);
//        } else {
//            imageView.setImageResource(R.drawable.ok);
//        }
//
//        return rowView;
//    }

}
