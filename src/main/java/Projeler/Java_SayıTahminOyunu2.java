package Projeler;

import java.util.Scanner;

public class Java_SayıTahminOyunu2 {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        int	tahmin = (int)(Math.random()*100);

        System.out.println("Tahmin oyununa hosgelgin !");
        System.out.print("1-100 arasi sayi tut :) :");

        boolean sayiBulunmadi = true;
        int denemeSayisi = 0;
        int sayac = str.nextInt() ;

        while(sayiBulunmadi)
        {
            denemeSayisi++;

            if(tahmin>sayac)
            {
                System.out.println(denemeSayisi+".denemeniz yazdiniz sayi hedef sayidan kucuktur");
            }

            else if (tahmin<sayac)
            {
                System.out.println(denemeSayisi+".denemeniz yazdiniz sayi hedef sayidan buyuktur");
            }

            else if (tahmin==sayac)
            {
                sayiBulunmadi=false;

                System.out.println("tebrikler "+denemeSayisi+". denemede buldunuz");
            }

            sayac = str.nextInt() ;
        }


    }
}
