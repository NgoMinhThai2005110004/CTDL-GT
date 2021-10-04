package com.thainm2005110004.Tuan02;

public class CowTestDrive {

    public static void main(String[] args) {
        Cow cow;
        //cow = new Cow();
        cow = new Cow(15);
        System.out.println("weight: " + cow.weight);


        cow = new Cow(5);
        System.out.println("weight: " + cow.weight);
        

        cow = new Cow(30, "Anh", "Trang");
        System.out.println("weight: " + cow.weight + "Breed: " + cow.breed + "Color: " + cow.color);




    }

}
