package JavaMülakatÖrnekSorular;

import java.util.Scanner;

public class Java_KelimedeSesliHarfSayisiBulma {
    public static int VowelCount(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Keep this function call as per the example
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        System.out.println("Vowel Count: " + VowelCount(input));
    }
}
