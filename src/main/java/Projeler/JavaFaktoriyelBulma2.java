package Projeler;

import java.util.Scanner;

public class JavaFaktoriyelBulma2 {

    //Faktöriyel bulma
    public static void main(String[] args) {


        //Bir sayının faktöriyelini bulma

    Scanner scanner = new Scanner(System.in);

        int faktoriyel = 1;

        System.out.print("Lütfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 1; i<=sayi;i++){

            faktoriyel*=i;
        }
        System.out.println(sayi+" sayisinin faktöriyeli : " +faktoriyel);
   }


}
