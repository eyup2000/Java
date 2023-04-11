package Projeler;

import java.util.Scanner;

public class Java_Alıştırma5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Lütfen bir sayi giriniz");

            int sayi = scan.nextInt();

            boolean asalmi = true;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalmi = false;
                    break;
                }
            }
            if (asalmi) {
                System.out.println(sayi + " sayisi asaldir");
            } else {
                System.out.println(sayi + " sayisi asal değildir");
            }


        }
    }
}