package Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Alıştırma6 {
    public static void main(String[] args) {
        int arr[]={5,2,6,6,8,9,8,5,2,4,4};

        List<Integer> tekrarsizSayilar= new ArrayList<>();

        for (int i = 0; i<arr.length; i++){
            if (!tekrarsizSayilar.contains(arr[i])){
                tekrarsizSayilar.add(arr[i]);
            }

        }
        System.out.println(tekrarsizSayilar);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen bir cümle yaziniz : ");
        String tersYazi = scanner.nextLine();

        for (int i = tersYazi.length()-1; i>=0; i--){
            System.out.print(tersYazi.charAt(i));

        }

        }







    }





