package cl.uv.ici.tallerdeandroid.hacehambre.model.employee;


public class Employee {

    private int id;
    private String name;
    private String function;

    public Employee(int id, String name, String function) {
        this.id = id;
        this.name = name;
        this.function = function;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }


}
