package odevler;

import java.util.Scanner;

public class KDVtutariHesaplamaProgrami {
    public static void main(String[] args) {
        float fiyat;

        Scanner scan=new Scanner(System.in);
        System.out.println("urun fiyati girin: ");
        fiyat=scan.nextFloat();
        System.out.println("kdv'siz fiyat: "+fiyat);
    }
}
