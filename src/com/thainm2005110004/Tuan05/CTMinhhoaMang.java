package com.thainm2005110004.Tuan05;

public class CTMinhhoaMang {
    public static void main(String[] args) {
    int arr[] = {3,5,7,9};
    int n = arr.length;
    int newElement = 8;
    int [] newArr = new int[n + 5];
    for(int i = 0; i < n; i ++){
        newArr[i] = arr[i];
    }
    System.out.println("In mang cu");
    for(int x : arr){
        System.out.println(x);
    }
    newArr[n] = newElement;
    System.out.println("In mang moi");
    for(int x : newArr){
        System.out.println(x);
    }
}
}