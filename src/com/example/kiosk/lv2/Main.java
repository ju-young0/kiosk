package com.example.kiosk.lv2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//    1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
//    2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
//    3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
//    4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while (start) {
            // 메뉴 출력
            System.out.println("\n햄버거 메뉴:");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).getName());
            }
            System.out.println("0. 프로그램 종료");

            // 사용자 입력 받기
            System.out.print("메뉴를 선택하세요 (번호 입력): ");
            // 번호 입력
            int choice = sc.nextInt();

            // switch문으로 처리
            switch (choice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    start = false;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    // 메뉴 출력
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.println("\n선택한 메뉴:");
                    System.out.println(choice + ". " + selectedItem.getName()+" | W "+selectedItem.getPrice()+" | "+selectedItem.getDescription());
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
        // Scanner 닫기
        sc.close();
    }
}


