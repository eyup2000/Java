package Projeler;

import java.util.Scanner;

public class Java_SayıTekmiÇiftmi {
    public static void main(String[] args) {
        /*
        girilen sayı çiftmi tekmi?

         */
        Scanner scanner = new Scanner(System.in);
        int dongu = 10;

        for (int i = 0; i<dongu; i++){

            System.out.println("bir sayı giriniz");
            int sayı = scanner.nextInt();

            if (sayı % 2 == 0) {
                System.out.println(sayı + " çift bir sayıdır!!");
            }
            else {
                System.out.println(sayı + " tek bir sayıdır!!");
            }

        }

    }
}
