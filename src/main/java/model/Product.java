package model;

public class Product {
    private int id_product;
    private String name;
    private double price;
    private int quantity;
    private String color;
    private String description;
    private String category;

    public Product(int id_product, String name, double price, int quantity, String color, String description, String category) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product(String name, double price, int quantity, String color, String description, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product(String name, double price, int quantity, String color, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.description = description;
    }

    public Product(int id_product, String name, double price, int quantity, String color, String description) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.description = description;
    }

    public int getId_product() {return id_product;}

    public String getName() {return name;}

    public double getPrice() {return price;}

    public int getQuantity() {return quantity;}

    public String getColor() {return color;}

    public String getDescription() {return description;}

    public String getCategory() {return category;}

}
