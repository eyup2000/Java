package Projeler;

import java.util.Scanner;

public class Java_Alıştırma {
    public static void main(String[] args) {
        /*
            Kullanicidan bir harf secmesini isteyin :A, B, C
            Eger kullanici "A" secerse => Java kolaydir diyelim
            Eger kullanici "B" secerse =? Java eglencelidir diyelim
            Eger kullanici "C" secerse => Java ogrenmek icin calismaniz lazim diyelim
            orn: sonuc A: Java kolaydir
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz A - B - C : ");
        String girilenHarf = scan.nextLine();

        if (girilenHarf.equals("A")){

            System.out.println("Java kolaydır :) ");

        } else if (girilenHarf.equals("B")) {

            System.out.println("Java eğlencelidir :)");

        } else if (girilenHarf.equals("C")) {
            System.out.println("Java öğrenmek için çalişmamız lazım!!");

        }else {

            System.out.println("Lütfen A - B - C harlerinden birini seçiniz!!!");
        }


    }
}
