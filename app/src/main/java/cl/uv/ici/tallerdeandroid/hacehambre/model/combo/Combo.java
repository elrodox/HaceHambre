package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;

import java.io.Serializable;
import java.util.Calendar;

import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Bread;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Meat;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.Vegetal;

public class Combo implements ICombo, Serializable {

    private int comboId;
    private Vegetal[] vegetales = new Vegetal[2];
    private Meat meat;
    private Bread bread;
    private int imageId;
    private Calendar comboDate;
    private int totalCost;


    public Combo(int id, Vegetal[] vegetales, Meat meat, Bread bread) {
        this.comboId = id;
        this.vegetales = vegetales;
        this.meat = meat;
        this.bread = bread;
    }

    public void setComboDate(Calendar date){
        this.comboDate = date;
    }

    public Calendar getComboDate(){ return comboDate;}

    public int getComboId(){
        return comboId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Vegetal[] getVegetales() {
        return vegetales;
    }

    public Meat getMeat() {
        return meat;
    }

    public Bread getBread() {
        return bread;
    }

    @Override
    public String getComboComponents(){
        String components = "Combo #"+getComboId()+" Componentes: ";
        for (int i =0; i<getVegetales().length; i++){
            String separator = " + ";
            if(i==getVegetales().length-1){
                separator="";
            }
            components = components+getVegetales()[i].getName()+separator;
        }
        return components+" + "+getMeat().getName()+" + "+getBread().getName();
    }

    @Override
    public int calculateCost() {
        return totalCost = getVegetales()[0].getCost() + getVegetales()[1].getCost() + getBread().getCost() + getMeat().getCost();
    }

}
