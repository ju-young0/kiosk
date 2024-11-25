package com.example.kiosk.lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItem){
        this.menuItems = menuItem;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // 메뉴 출력
            System.out.println("\n[ HAMBURGER MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).getName());
            }
            System.out.println("0. 프로그램 종료");

            // 사용자 입력 받기
            System.out.print("메뉴를 선택하세요 (번호 입력): ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            // switch문으로 처리
            switch (choice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    if(choice > 0 && choice <= menuItems.size()) {
                        MenuItem selectedItem = menuItems.get(choice - 1);
                        System.out.println("\n선택한 메뉴:");
                        System.out.println(choice + ". " + selectedItem.getName()+" | W "+selectedItem.getPrice()+" | "+selectedItem.getDescription());
                    }
                    break;
            }
        }
        // Scanner 닫기
        sc.close();
    }
}
