package com.thainm2005110004.kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apple {
    int ID;
    float weight;
    String color;
    Scanner kho = new Scanner(System.in);
    static List<Apple> lApple = new ArrayList<>();
    public Apple(int ID, float weight, String color) {
        ID = ID;
        this.weight = weight;
        this.color = color;
    }
    Apple()
    {

    }
   public void menu(){
       System.out.println("-----------MENU----------");
       System.out.println("1--------Tao Apple-------");
       System.out.println("2-------Them Apple-------");
       System.out.println("3--------Tim Apple-------");
       System.out.println("4---------In Apple-------");
       System.out.println("-----------EXIT----------");
   }
   public void input()
   {
       System.out.println("Nhap ID Apple:");
       ID = kho.nextInt();
       System.out.println("Nhap khoi luong Apple:");
       weight = kho.nextFloat();
       kho.nextLine();
       System.out.println("Nhap mau Apple:");
       color = kho.nextLine();
   }
   public void displayApple(){
        System.out.println("----------Apple--------");
        System.out.printf("%-20S %-20S %-20S\n","id applle", "weight apple", "color apple");
   }
   public void display()
   {
       for (Apple apple : lApple) {
           apple.displayApple();
            System.out.printf("%-20d %-20.2f %-20S\n",ID, weight,color);
       }
       
   }
   public void addApple()
   {
       System.out.println("Nhap tong so Apple tao:");
       int n = kho.nextInt();
       for(int  i = 0; i < n; i++)
       {
           Apple apple = new Apple();
           input();
           lApple.add(apple);
       }
   }
   public void find()
   {
       System.out.println("Nhap mau ban muon tim:");
       String ten = kho.nextLine();
       for (Apple apple : lApple) {
           if(ten.equals(apple.color)){
               apple.displayApple();
           }
       }
   }
   
}

