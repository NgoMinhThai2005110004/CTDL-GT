package com.thainm2005110004.Tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh;
        maytinh = new MayTinh("Ngo Minh Thai", 2002, "Window 10", "32Gb", "GiGaByte", 10000000, 3);
        System.out.println("Nha san xuat: " + maytinh.Nhasanxuat + "Nam san xuat: " + maytinh.Namsanxuat + "He dieu hanh: "+ maytinh.Hedieuhanh + "RAM: " + maytinh.Ram + "CPU: " + maytinh.CPU + "Gia: " + maytinh.Gia + "Nam bao hanh: " + maytinh.nambaohanh);
    }
    
}

