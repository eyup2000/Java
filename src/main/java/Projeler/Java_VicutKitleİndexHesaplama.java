package Projeler;

import java.util.Scanner;

public class Java_VicutKitleİndexHesaplama {
    public static void main(String[] args) {
        //vicut kitle indexi hesaplama

        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        double boy = scanner.nextDouble();

        System.out.println("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

       double sonuc = kilo/(boy*boy);

       if (sonuc<18){
           System.out.println("Vicut kitle indexsiniz : " + sonuc );
           System.out.println( "Zayif");
       } else if (sonuc>=18 && sonuc<=24.9) {
           System.out.println("vicut kitle indexsiniz : "+sonuc);
           System.out.println("Normal");
       } else if (sonuc>25 && sonuc<=34.9) {
           System.out.println("vicut kitle indexsiniz : " +sonuc);
           System.out.println("şişman");
       } else if (sonuc>35 && sonuc<49.9) {
           System.out.println("Vicut kitle indexsiniz : " +sonuc);
           System.out.println("Obez");

       }
       else {
           System.out.println(sonuc);
           System.out.println("İnsan oldugunuzdan şüpheliyiz!!");
       }
    }

}
