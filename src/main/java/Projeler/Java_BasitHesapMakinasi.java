package Projeler;

import java.util.Scanner;

public class Java_BasitHesapMakinasi {
    //Basit Hesap makinasi

    public static void main(String[] args) {

        Scanner hesap = new Scanner(System.in);

        int sayi1;
        int sayi2;
        int sec;

        System.out.println("Bir sayi giriniz : ");
        sayi1 = hesap.nextInt();

        System.out.println("Ikinci sayi giriniz : ");
        sayi2 = hesap.nextInt();

        System.out.println("Yapmak istediniz islemi seciniz : ");
        System.out.println("1- Toplama :  ");
        System.out.println("2- cikarma : ");
        System.out.println("3- carpma : ");
        System.out.println("4- bolme : ");

        System.out.println("seciminizi yaziniz : ");
        sec = hesap.nextInt();

        if (sec == 1) {
            System.out.println("Toplam : " + (sayi1 + sayi2));
        } else if (sec == 2) {
            System.out.println("cikartma : " + (sayi1 - sayi2));

        } else if (sec == 3) {
            System.out.println("carpma : " + (sayi1 * sayi2));
        } else if (sec == 4) {
            System.out.println("bolme : " + (sayi1 / sayi2));
        }
    }
}
