package odevler;

import java.util.Scanner;

public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucgenin yari capini giriniz : ");
        r = input.nextInt();
        System.out.println("Ucgenin alani = " + pi * r * r);
        System.out.println("Ucgenin cevresi = " + pi * r * 2);
    }
}
