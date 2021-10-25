package com.thainm2005110004.kiemtragiuaki;

public class Apple {
    String mausac;
    int ma;
    float khoiluong;

    Apple(){}

    Apple(String ms, int id, float kl){
        mausac = ms;
        ma = id;
        khoiluong = kl;
    }

    void inThongtin(){
        System.out.println("Màu sắc: " + mausac + "Mã id: " + ma + "Khối lượng: " + khoiluong);

    }
}

