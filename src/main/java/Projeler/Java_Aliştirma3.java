package Projeler;

import java.util.ArrayList;
import java.util.List;

public class Java_Aliştirma3 {
    public static void main(String[] args) {
        /*
        List'eki tek sayilari silen ve cift sayilari 3 ile carpan bir method olusturun
                */
        List<Integer> list1= new ArrayList <>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(4);
        list1.add(6);
        System.out.println(list1);
        for (int i = 0; i<list1.size(); i++){

            if (list1.get(i)%2==1){

                list1.remove(i);
                i--;

            }else {
                list1.set(i, list1.get(i)*3);
            }

        }
        System.out.println(list1);
    }
}
