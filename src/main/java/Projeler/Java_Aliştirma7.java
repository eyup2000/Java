package Projeler;

import java.util.Scanner;

public class Java_Aliştirma7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int faktoriyel = 1;

        while (sayi>0){

            faktoriyel=faktoriyel*sayi;
           // faktoriyel*=sayi;
            sayi--;

        }

        System.out.println("Girilen sayinin faktoriyeli : "+faktoriyel);

    }
}
