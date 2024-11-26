package com.example.kiosk.lv5;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * get메서드
     * @return
     */
    public String getName(){
        return name;
    }

    public double getPrice(){
        return  price;
    }

    public  String getDescription(){
        return description;
    }

    /**
     * set메서드
     * @return
     */
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("가격은 음수가 될 수 없습니다.");
        }
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}
