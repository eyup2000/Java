package JavaMülakatÖrnekSorular;

import java.util.Arrays;

public class Java_EnbüyükSayiyiBulma {

   // Verilen bir dizideki en büyük iki sayıyı bulan bir Java programı yazın.
    public static void main(String[] args) {

        int arr[] = {20,60,80,10,90,70,50,30,40};



        Arrays.sort(arr);

        int enBuyuk = arr[arr.length - 1];
        int ikinciBuyuk = arr[arr.length - 2];

        System.out.println("Dizideki en büyük sayı: " + enBuyuk);
        System.out.println("Dizideki ikinci en büyük sayı: " + ikinciBuyuk);
    }
}
