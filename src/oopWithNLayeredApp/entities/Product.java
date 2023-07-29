package oopWithNLayeredApp.entities;

public class Product {
    private int id;
    private String Name;
    private double unitPrice;
    public Product()
    {
        super();
    }

    public Product(int id, String name, double unitPrice) {
        this.id = id;
        Name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
