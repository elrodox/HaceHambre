package cl.uv.ici.tallerdeandroid.hacehambre.model;

import java.util.Date;

/**
 * Created by Rodolfo on 08/12/2016.
 */
public class Pedido {
    private int id;
    private Date date;

    public Pedido(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}
