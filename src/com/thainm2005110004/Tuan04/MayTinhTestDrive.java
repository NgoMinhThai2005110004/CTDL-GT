package com.thainm2005110004.Tuan04;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh[] danhsachMT = new MayTinh[2];
        MayTinh mt0 = new MayTinh("Ngo Minh Thai", 2002, "A" , 4, "GiGabyte",60000, 2);
        MayTinh mt1 = new MayTinh("Ngo Phuoc Loc", 2016, "IOS", 64,"Naruto", 100000,3);
            danhsachMT[0] = mt0;
            danhsachMT[1] = mt1;
        for(MayTinh mt : danhsachMT){
            mt.inthongtin();
        }
    }
    
}