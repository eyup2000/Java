package JavaMülakatÖrnekSorular;

public class Java_EnBuyukVeEnKucukSayı {
        public static void main(String[] args) {

            int[] dizi = {2, 5, 7, 3, 1, 8, 4, 6}; // örnek bir dizi

            int enBuyuk = dizi[0];
            int enKucuk = dizi[0];

            for (int i = 1; i < dizi.length; i++) {
                if (dizi[i] > enBuyuk) {
                    enBuyuk = dizi[i];
                }
                if (dizi[i] < enKucuk) {
                    enKucuk = dizi[i];
                }
            }
            System.out.println("En büyük sayı: " + enBuyuk);
            System.out.println("En küçük sayı: " + enKucuk);
        }
    }


