package Projeler;

import java.util.Scanner;

public class Java_ÜrününKDVliFiyatınıBulma {

    //bir ürün fiyatının kdv li fiyatını bulan bir kod yazınız

    public static void main(String[] args) {

        double  fiyat , kdvfiyat , kdv = 0.19;


        Scanner hesap = new Scanner(System.in);

        System.out.println("urun fiyatini giriniz : ");
        fiyat =  hesap.nextDouble();

        kdvfiyat = fiyat + (fiyat*kdv);
        System.out.println("urunun kdv'li fiyati :  " + kdvfiyat);



    }
}
