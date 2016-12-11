package cl.uv.ici.tallerdeandroid.hacehambre.model.food;

import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchase;
import cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator.IPurchaseDecorator;

/**
 * Created by Rodolfo on 10/12/2016.
 */
public interface IFood {

    public abstract String getName();
    public abstract int getCost();
    public abstract int getWeight();
    public abstract String getType();
}
