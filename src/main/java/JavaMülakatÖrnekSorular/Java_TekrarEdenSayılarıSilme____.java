package JavaMülakatÖrnekSorular;

import java.util.ArrayList;
import java.util.List;

public class Java_TekrarEdenSayılarıSilme____ {
    public static void main(String[] args) {
        //Array'deki tekrar eden ssayıları silip
        //her sayıdan 1 tane olan bir arry listesi olan bir kod yazınız

        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};


        List<Integer> tekrarsizSayilar = new ArrayList<>();

        for (int i = 0; i< arr.length; i++){
            if (!tekrarsizSayilar.contains(arr[i])){
                tekrarsizSayilar.add(arr[i]);
            }

        }
        System.out.println(tekrarsizSayilar);


        int [] arr2 = {2,6,6,9,5,4,7,8,2,1,3,2,6,5,9,8,74,8,9,6,5,23,14};

      List<Integer>  tekrarEtmeyenSayilar = new ArrayList<>();

      for (int i =0; i< arr2.length; i++){

          if (!tekrarEtmeyenSayilar.contains(arr2[i])){

              tekrarEtmeyenSayilar.add(arr2[i]);
          }


      }
        System.out.println(tekrarEtmeyenSayilar);













    }


}
