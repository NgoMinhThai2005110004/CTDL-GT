package com.thainm2005110004.Tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien;
        nhanvien = new NhanVien("Ngo Minh Thai", 6000000, "10 Hoa Sua", "DH Gia Dinh", "30-08-2002");
        System.out.println("Ten Nhan Vien: " + nhanvien.TenNhanVien + "Luong: " + nhanvien.Luong + "Dia Chi: " +nhanvien.diachi + "Bo phan lam viec: " + nhanvien.bophanlamviec + "Ngay Sinh: " + nhanvien.NgaySinh);
    }
    
}