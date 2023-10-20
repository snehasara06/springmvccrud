package com.kgisl.springmvccrud;

public class Laptop {
    
    private int id;
    private String name;
    private String color;
    private float price;

    {
        System.out.println("helloooooo");
    }
    public Laptop(){
        
    }

    public Laptop(int id, String name, String color, float price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    

    
}
