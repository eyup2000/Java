package Projeler;

import java.util.Scanner;

public class Java_BirKarakterinAsciDeğeriniBulma {
    public static void main(String[] args) {
        // Kullanicidan bir karakter girmesini isteyin ve bu karakterin ASCII degerini bulunuz

        Scanner scan = new Scanner(System.in);
        Boolean h = true;

        while (h) {

            System.out.println(" Lutfen bir karakter giriniz");
            char karakter = scan.next().charAt(0);

            int in = karakter;

            System.out.println(karakter + " ASCII degeri: " + in);
        }
    }
}

