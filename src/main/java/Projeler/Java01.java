package Projeler;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
        //İki sayının toplamı ve ortalamasını bulmak
        int sayi1 = 10;
        int sayi2 = 20;
       int toplam =0 , ortalama=0;
       toplam = sayi1+sayi2;
       ortalama=toplam/2;
        System.out.println(toplam);
        System.out.println(ortalama);


        System.out.println("-----------------------------------------------------");


        int sayi01,sayi02,toplam01 , ortalama01;

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz : ");
        sayi01 = scan.nextInt();
        System.out.println("2.Sayiyi giriniz : ");
        sayi02 = scan.nextInt();

        toplam01 = sayi01 + sayi02;
        System.out.println("toplam "+toplam01);

        ortalama01 = toplam01 / 2;
        System.out.println("ortalama "+ortalama01);



    }
}
