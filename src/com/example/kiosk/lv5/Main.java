package com.example.kiosk.lv5;

public class Main {
    public static void main(String[] args) {

        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Milk Shake", 5.4, "밀크쉨"));
        drinks.addMenuItem(new MenuItem("Coca-Cola", 5.4, "커카컬라"));
        drinks.addMenuItem(new MenuItem("Coca-Cola Zero", 5.4, "커카컬라줴로"));
        drinks.addMenuItem(new MenuItem("Iced-Americano", 5.4, "따듯한 아이스 아메리카노 주세요"));

        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Apple pie", 5.4, "애뽈퐈이"));
        desserts.addMenuItem(new MenuItem("Ice cream", 5.4, "아이쮸꾸림"));
        desserts.addMenuItem(new MenuItem("Ice Cream Latte", 5.4, "아이쭈쿠림 롸떼"));
        desserts.addMenuItem(new MenuItem("Pineapple fruit cup", 5.4, "딸기 코코넛 푸딩"));


        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinks);
        kiosk.addMenu(desserts);
        // 시작
        kiosk.start();
    }
}
