package odevler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kg cinsinden kilonuzu girin: ");
        double kilo=scan.nextDouble();
        System.out.println("lutfen metre cinsinden boyunuzu girin: ");
        double boy= scan.nextDouble();
        double vKitIndex=kilo/(boy*boy);
        System.out.println("Vucut Kitle Indexi: "+vKitIndex);
    }
}
