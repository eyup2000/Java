package Projeler;

import java.util.ArrayList;
import java.util.List;

public class Java12 {
    public static void main(String[] args) {
        //Array'deki tekrar eden ssayıları silip
        //her sayıdan 1 tane olan bir arry listesi olan bir kod yazınız

        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};


        List<Integer> tekrarsizSayilar = new ArrayList<>();

        for (int i = 0; i< arr.length; i++){
            if (!tekrarsizSayilar.contains(arr[i])){
                tekrarsizSayilar.add(arr[i]);
            }

        }System.out.println(tekrarsizSayilar);
    }
}
