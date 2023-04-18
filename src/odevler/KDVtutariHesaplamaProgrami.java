package odevler;

import java.util.Scanner;

public class KDVtutariHesaplamaProgrami {
    public static void main(String[] args) {
        float fiyat;

        Scanner scan=new Scanner(System.in);
        System.out.println("urun fiyati girin: ");
        fiyat=scan.nextFloat();
        System.out.println("kdv'siz fiyat: "+fiyat);

        if (fiyat<=1000){
            float tmp=fiyat;
            System.out.println("KDV orani: %18");
            System.out.println("KDV tutari: "+(fiyat-tmp));
            System.out.println("KDV'li fiyat: "+fiyat);
        }
    }
}
