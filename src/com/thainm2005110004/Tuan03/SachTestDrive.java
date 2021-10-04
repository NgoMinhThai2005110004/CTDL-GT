package com.thainm2005110004.Tuan03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach(15000, "Ngo Minh Thai", 2002, 40000, 10, "A");
        System.out.println("Gia: "+ sach.gia + "Nha xuat ban: " + sach.nhaxuatban + "Nam xuat ban: " + sach.namxuatban + "Gia ban:" + sach.giaban + "So luong: " + sach.soluong + "Loai: "+ sach.loai);
    }
    
}