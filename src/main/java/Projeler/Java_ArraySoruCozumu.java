package Projeler;

public class Java_ArraySoruCozumu {
    public static void main(String[] args) {


        // Orn 4: Bir String Array olusturun ve "Tom" dan onceki elemanları yazdirin
        String ogrenciler[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for (String w : ogrenciler ){
            if(w.equals("Tom")) {
                break;
            }
            System.out.println(w);

        }


        System.out.println("========");

         // Orn 6: Bir String Array olusturun ve "Tom" dan farkli elemanlari yazdirin
        String musteri[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for (String eleman: musteri){
            if (eleman.equals("Tom")) {
                continue;
            }
            System.out.print (eleman + " "); //  Ali Thomas Mark Jackson Martin
        }



}
}