package com.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;  //상위 카테고리 메뉴 리스트

    public Kiosk(){
        this.menus = new ArrayList<>();
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryMenu());
            }
            System.out.println("0. 프로그램 종료");
            // 숫자 입력 받기
            System.out.print("메뉴를 선택하세요 (번호 입력): ");
            int categoryChoice;
            try {
                categoryChoice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }
            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
                break;
            }else if(categoryChoice > 0 && categoryChoice <= menus.size()) {
                Menu selectMenu = menus.get(categoryChoice - 1);
                System.out.println("====="+ selectMenu.getCategoryMenu() + "=====");
                selectMenu.showMenuItems();

                System.out.println("메뉴를 선택하세요 (번호 입력):");
                int itemChoice;
                try {
                    itemChoice = Integer.parseInt(sc.nextLine());
                }catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }
                // 메뉴 -> 내가 선택한 메뉴 호출
                if (itemChoice > 0 && itemChoice <= selectMenu.getMenuItems().size()) {
                    MenuItem selectItem = selectMenu.getMenuItems().get(itemChoice -1);
                    System.out.println("선택한 메뉴 : ");
                    System.out.println(categoryChoice + ". " + selectItem.getName()+" | W "+selectItem.getPrice()+" | "+selectItem.getDescription());
                }else {
                    System.out.println("잘못된 숫자입니다. 다시 선택해주세요.");
                }
            }else {
                System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }
        }
        // 스캐너 닫기
        sc.close();
    }
}
