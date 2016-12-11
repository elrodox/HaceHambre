package cl.uv.ici.tallerdeandroid.hacehambre.purchaseDecorator;

import java.util.List;

/**
 * Created by Rodolfo on 10/12/2016.
 */
public abstract class IPurchaseDecorator implements IPurchase {
    protected IPurchase decoratedPurchase;

    public IPurchaseDecorator(IPurchase decoratedCombo){
        this.decoratedPurchase = decoratedCombo;
    }

    public int getCost(){
        return decoratedPurchase.getCost();
    }
//    public List<String> getProducts(){
//        return decoratedPurchase.getProducts();
//    }
}
