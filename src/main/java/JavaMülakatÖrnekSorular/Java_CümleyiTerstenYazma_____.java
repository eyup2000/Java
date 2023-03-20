package JavaMülakatÖrnekSorular;

import java.util.Scanner;

public class Java_CümleyiTerstenYazma_____ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi giriniz : ");
        String isim=scan.nextLine();
        //merhaba ben Mehmet

        for (int i=isim.length()-1; i>=0; i--){

            System.out.print(isim.charAt(i));
        }
    }

}
