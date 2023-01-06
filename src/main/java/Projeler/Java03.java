package Projeler;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        //matemetik fen ve türkçe ders ort. hesaplama.

        Scanner str = new Scanner(System.in);

        int  matematik;
        int türkçe;
        int fen;

        System.out.println("Matemetik sinav sonunuzu giriniz : ");
        matematik = str.nextInt();

        System.out.println("Turkce sinav sonucunuzu giriniz :  ");
        türkçe = str.nextInt();

        System.out.println("Fen sinav sonucunuz giriniz : ");
        fen = str.nextInt();


        if(matematik>=0 && matematik<=49)
        {
            System.out.println("Matematik dersinden kaldiniz :( ");
        }
        else if(matematik>=50 && matematik<=100)
        {
            System.out.println("Matematik dersinden gectiniz :)");
        }
        else
        {
            System.out.println("Lutfen gecerli bir sayi giriniz !");
        }


        if(türkçe>=0 && türkçe<=49)
        {
            System.out.println("turkce dersinden kaldiniz :( ");
        }
        else if(türkçe>=50 && türkçe<=100)
        {
            System.out.println("turkce dersinden gectiniz :)");
        }
        else
        {
            System.out.println("Lutfen gecerli bir sayi giriniz !");
        }


        if(fen>=0 && fen<=49)
        {
            System.out.println("fen dersinden kaldiniz :( ");
        }
        else if(fen>=50 && fen<=100)
        {
            System.out.println("fen dersinden gectiniz :)");
        }
        else
        {
            System.out.println("Lutfen gecerli bir sayi giriniz !");
        }
        double ortalama = (fen + türkçe + matematik )  / 3;

        System.out.println("Genel ortalaniz : " + ortalama);

        String sonuc= (ortalama >=50) ? "tebrikler gectiniz :)" : "uzgunuz malesef kaldiniz :(";

        System.out.println(sonuc);

    }
}
