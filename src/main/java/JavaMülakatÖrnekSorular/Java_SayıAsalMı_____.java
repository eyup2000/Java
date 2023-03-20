package JavaMülakatÖrnekSorular;

import java.util.Scanner;

public class Java_SayıAsalMı_____ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        int num = scan.nextInt();

        boolean AsalMı= true;

        for (int i =2; i<num/2; i++){
            if (num % i ==0){
                AsalMı = false;
                break;
            }
        }
        if (AsalMı){
            System.out.println(num+" sayısı Asaldır");
        }else {
            System.out.println(num+" sayısı Asal değildir");
        }
    }
}
