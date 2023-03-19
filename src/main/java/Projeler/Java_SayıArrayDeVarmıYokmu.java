package Projeler;

import java.util.Scanner;

public class Java_SayıArrayDeVarmıYokmu {

    //Kullanıcının yazdığı sayıyı aray içerisinde var olup olmadığını bulan bir kod yazınız.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[]{1,5,6,9,4,8,3,2,4,};
        System.out.println("Bir sayı giriniz : ");
        int aranacakSayı= scanner.nextInt();

        for(int sayı : arr){
            if(sayı==aranacakSayı){
                System.out.println(aranacakSayı+" sayısı mevcuttur");
                break;
            }

        }


    }
}
