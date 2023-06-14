package odevler;

import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenar uzunluklarini giriniz : ");
        a = input.nextInt();
        System.out.print("B kenar uzunluklarini giriniz : ");
        b = input.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        System.out.println("C (Hipotenus) uzunlugu = " + c);
        System.out.println("Ucgenin cevresi = " + u * 2);

    }
}
