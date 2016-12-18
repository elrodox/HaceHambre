package cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator;

import android.util.Log;

import java.util.List;

/**
 * Created by Rodolfo on 10/12/2016.
 */
public abstract class IPurchaseDecorator implements IPurchase {
    protected IPurchase decoratedPurchase = null;

    public IPurchaseDecorator(IPurchase decoratedCombo){
        this.decoratedPurchase = decoratedCombo;
    }

//    @Override
//    public int getCost(){
//        Log.d("getCost", "IPurchaseDecorator");
//        return decoratedPurchase.getCost();
//    }

    public void setDecoratedPurchase(IPurchase decoratedPurchase) {
        this.decoratedPurchase = decoratedPurchase;
    }

    //    public List<String> getProducts(){
//        return decoratedPurchase.getProducts();
//    }
}
