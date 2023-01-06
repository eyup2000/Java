package Projeler;

import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {

    //Karne ort. hesaplama
        //kotu
        //iyi
        //çok iyi

        Scanner karne = new Scanner(System.in);

        System.out.println("Notunuzu giriniz : ");
        int not = karne.nextInt();


        if(not>=0 && not<=49)
        {
            System.out.println("kotu");

        }
        else if (not>=50 && not<=69)
        {
            System.out.println("orta");

        }
        else if (not>=70 && not<=84)
        {
            System.out.println("iyi");
        }
        else if (not>=85 && not<=100)
        {
            System.out.println("cok iyi");
        }

        else {

            System.out.println("Gecersizi Not Girmis Bulunmaktasiniz ! ");
        }


    }

}
