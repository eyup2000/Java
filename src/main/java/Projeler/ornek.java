package Projeler;

import java.util.Scanner;



public class ornek {

    static int sayı;
    public int sayılar;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Lütfen bir sayı girin: ");



        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(number + " sayısının faktöriyeli = " + result);
    }}
}
