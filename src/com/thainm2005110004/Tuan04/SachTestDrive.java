package com.thainm2005110004.Tuan04;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach[] danhsachSach = new Sach[2];
        Sach sach0 = new Sach(15000 , "Ngo Minh Thai 2005", 2002 , 100000, 10 , "B");
        Sach sach1 = new Sach(25000, "Ngo Phuoc Loc" , 1999, 4000, 1000, "A");
        danhsachSach[0] = sach0;
        danhsachSach[1] = sach1;
        for(Sach sach : danhsachSach){
            sach.inthongtin();
        }

    }
    
}
