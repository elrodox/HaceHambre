package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import java.io.Serializable;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;
import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchaseDecorator;

/**
 * Created by Rodolfo on 10/12/2016.
 */
public interface IFood extends Serializable{

    public String getName();
    public int getCost();
    public int getWeight();
    public String getType();
}
