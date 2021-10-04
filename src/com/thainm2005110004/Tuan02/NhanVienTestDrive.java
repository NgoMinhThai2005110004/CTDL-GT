package com.thainm2005110004.Tuan02;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien;
        nhanvien = new NhanVien();
        nhanvien.tenNV = "Ngo Minh Thai";
        nhanvien.NgaySinh = "30-08-2002";
        nhanvien.Luong = 5000000;
        nhanvien.Diachi = "10 Hoa Sua";
        nhanvien.Bophanlamviec = "SKT";

        nhanvien.inThongtinNV();
    }
    
}