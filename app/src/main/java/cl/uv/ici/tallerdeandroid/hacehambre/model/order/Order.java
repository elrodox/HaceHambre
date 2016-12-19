package cl.uv.ici.tallerdeandroid.hacehambre.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cl.uv.ici.tallerdeandroid.hacehambre.model.combo.ICombo;
import cl.uv.ici.tallerdeandroid.hacehambre.model.food.IFood;
import cl.uv.ici.tallerdeandroid.hacehambre.model.user.IUser;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class Order {
    private int id;
    private List<OrderItem> items;
    private int totalCost;
    private Date date;
    private String userName;

    public Order(){
        items = new ArrayList<>();
    }

    public Order(IUser user, ICombo combo)
    {
        id = -1;
        userName = user.getName();
        date = new Date();
        boolean itemCountIncremented = false;
        items = new ArrayList<>();
        for(IFood food : combo.getFoods())
        {
            itemCountIncremented = false;
            for(OrderItem item : items)
            {
                if(food.getName().equals(item.getName()))
                {
                    item.incrementCount();
                    itemCountIncremented = true;
                }
            }
            if(!itemCountIncremented)
            {
                items.add(new OrderItem(food.getName(), food.getCost()));
            }
        }
        totalCost = combo.getCost();
    }

    public int getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public Date getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
