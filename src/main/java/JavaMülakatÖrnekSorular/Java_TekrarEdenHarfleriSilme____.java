package JavaMülakatÖrnekSorular;

import java.util.ArrayList;

public class Java_TekrarEdenHarfleriSilme____ {
    /*bir stringdeki tekrar eden harfları silen bir metot oluşturunzu*/

    public static void main(String[] args) {

      String yazdirma =  tekrarEdenHarflariSilme("acabcahhagbchan");
        System.out.println(yazdirma);

       String d = tekrarlayanHarfleriSil("aaddhgsyy");
        System.out.println(d);

    }

    private static String tekrarEdenHarflariSilme(String str) {
        String TekrarsizHarfler ="";

        for (int i = 0; i<str.length(); i++){

          char c =  str.charAt(i);

          if (!TekrarsizHarfler.contains(c +"")){

              TekrarsizHarfler= TekrarsizHarfler + c;

          }



        }
        return TekrarsizHarfler;

    }

    public static String tekrarlayanHarfleriSil(String text) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char charc = text.charAt(i);
            if (!uniqueChars.contains(charc)) {
                uniqueChars.add(charc);
                result.append(charc);
            }
        }

        return result.toString();
    }
}
