package Projeler;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args) {
        String isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        isim=scan.nextLine();
        int i ;
        for (i=isim.length()-1; i>=0;i--){
            System.out.print(isim.charAt(i));
        }
    }

}
