package cf.mindaugas._5_spring_java_minimal_config.entity;

public class Customer {
    private int id;
    private String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
