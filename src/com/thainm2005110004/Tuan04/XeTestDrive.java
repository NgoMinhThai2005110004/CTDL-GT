package com.thainm2005110004.Tuan04;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe[] danhsachXe = new Xe[2];
        Xe xe0 = new Xe("Ngo Minh Thai","Honda", "RSX", "Co", "4lit");
        Xe xe1 = new Xe("Ngo Phuoc Loc", "Kawasaki","Z1000", "Ko", "17lit");
        danhsachXe[0] = xe0;
        danhsachXe[1] = xe1;
        for(Xe xe : danhsachXe){
            xe.intthongtin();
        }

    }
    
}
