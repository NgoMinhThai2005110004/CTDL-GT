package com.thainm2005110004.kiemtragiuaki;

import java.util.Scanner;

public class AppleTestDrive {
    static Apple apple = new Apple();
    static Scanner kho = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            apple.menu();
            System.out.println("Hay chon tu 1 den 4:");
            int n = kho.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                apple.input();
                break;
                case 2:
                apple.addApple();
                break;
                case 3:
                apple.find();
                break;
                case 4:
                apple.display();
                break;
                default: System.out.println("Loi roi!");
            }
        }while(true);
    }
}
