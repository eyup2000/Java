package JavaMülakatÖrnekSorular;

import java.util.Scanner;

public class Java_SayiKaçKezKullanıldı {

    /*
    Bir Array içerisindeki tam sayıların kaç kez yazılduğını bulan bir kod yazınız.

     */

    public static void main(String[] args) {

        int [] arr = {3,5,9,9,8,8,6,4,2,3,8,7,4,1,6,5,4,2,3,9,8,2,4,8,7,1,3,2,5,4,8,9,6,2,7,5,6};

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Lütfen bir rakam giriniz: ");
            int girilenSayi = scan.nextInt();

            int sayac = 0;

            for (int w : arr) {
                if (w == girilenSayi) {
                    sayac++;

                }

            }

            if (sayac > 0) {
                System.out.println(girilenSayi + " sayisi " + sayac + " kez yazılmıştır!!");
            } else {
                System.out.println(girilenSayi + " sayisi bu Array içerisinde yoktur!!");
            }


        }




    }
}
