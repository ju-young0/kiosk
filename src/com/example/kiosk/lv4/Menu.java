package com.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryMenu;  // 카테고리메뉴
    private List<MenuItem> menuItems; // 메뉴리스트

    /**
     * menu 생성자
     * @param categoryMenu
     */
    public Menu (String categoryMenu) {
        this.categoryMenu = categoryMenu;
        this.menuItems = new ArrayList<>();
    }

    /**
     * 카테고리 가져오기
     * @return categoryMenu
     */
    public String getCategoryMenu(){
        return categoryMenu;
    }

    /**
     * 메뉴 추가
     * @param item
     */
    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }

    /**
     * MenuItems 리스트 반환
     * @return menuItems
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * 카테고리 menuItems 출력
     */
    public void showMenuItems(){
        for (int i =0; i<menuItems.size(); i++) {
            System.out.println((i + 1) + "." + menuItems.get(i));
        }
    }


}
