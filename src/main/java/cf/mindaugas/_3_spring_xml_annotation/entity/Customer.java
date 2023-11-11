package cf.mindaugas._3_spring_xml_annotation.entity;

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
