package cl.uv.ici.tallerdeandroid.hacehambre.model.order;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class OrderItem {
    private int id;
    private String name;
    private int cost;
    private int count;

    public OrderItem(String name, int cost) {
        this.id = -1;
        this.name = name;
        this.cost = cost;
        this.count = 1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
