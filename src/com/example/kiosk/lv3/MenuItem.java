package com.example.kiosk.lv3;

public class MenuItem {
    private String name; // 이름
    private double price;  // 가격
    private String description; // 설명

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 이름 가져오기
    public String getName(){
        return name;
    }

    // 가격 가져오기
    public double getPrice(){
        return price;
    }

    // 설명 가져오기
    public String getDescription() {
        return description;
    }
}
