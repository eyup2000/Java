package Projeler;

import java.util.Scanner;

public class Java_FaktoriyelBulma {
    public static void main(String[] args) {


    //faktöriel bulma

    Scanner sc = new Scanner(System.in);


        System.out.println("Lütfen bil sayı giriniz : ");
        int sayi = sc.nextInt();


        int faktoriyel = 1;

        while (sayi>0){

            faktoriyel = faktoriyel*sayi;
           // faktöriyel*=sayı;

            sayi--;

        }
        System.out.println("sayının faktöriyeli : " + faktoriyel);

  }
}
