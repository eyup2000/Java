package Projeler;

import java.util.ArrayList;
import java.util.List;

public class Java_Alıştırma2 {
    public static void main(String[] args) {
        /*
        Array içerisindeki tekrar eden sayıları silen bir kod yazınız
         */

        int sayilar[] = {12,18,14,26,12,14,26,12,26};

        List<Integer> tekrarsizSayiler  = new ArrayList<>();

        for (int i = 0; i<sayilar.length; i++){

            if (!tekrarsizSayiler.contains(sayilar[i])){
                tekrarsizSayiler.add(sayilar[i]);
            }
        }

        System.out.println(tekrarsizSayiler);

    }
}
