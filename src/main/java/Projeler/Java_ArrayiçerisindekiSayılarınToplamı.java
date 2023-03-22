package Projeler;

import java.lang.reflect.Array;

public class Java_ArrayiçerisindekiSayılarınToplamı {
    public static void main(String[] args) {
        int [] sayilar = {6,8,95,14,75,21,9,8,4};

        int toplam = 0;

        for ( int i = 0; i<sayilar.length; i++){

           // toplam = toplam + sayilar[i];
            toplam += sayilar[i];

        }
        System.out.println(toplam);






    }
}
