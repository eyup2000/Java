package Projeler;

import java.util.Random;
import java.util.Scanner;

public class Java_MatOyunu {

        public static void main(String[] args) {
            int puan = 0;
            int soruSayisi = 0;
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Matematik Bulmaca Oyunu");

            while (true) {
                int sayi1 = random.nextInt(10);
                int sayi2 = random.nextInt(10);
                int islem = random.nextInt(2);
                int dogruCevap = 0;
                String islemAdi = "";

                if (islem == 0) {
                    dogruCevap = sayi1 + sayi2;
                    islemAdi = "+";
                } else {
                    dogruCevap = sayi1 - sayi2;
                    islemAdi = "-";
                }

                System.out.println(sayi1 + " " + islemAdi + " " + sayi2 + " = ?");
                int cevap = scanner.nextInt();
                soruSayisi++;

                if (cevap == dogruCevap) {
                    System.out.println("Doğru! Puanınız 10 arttı.");
                    puan += 10;
                } else {
                    System.out.println("Yanlış! Tekrar deneyin.");
                    puan -= 5;
                    soruSayisi--;
                }

                if (puan < 0) {
                    puan = 0;
                }

                System.out.println("Puanınız: " + puan);
                System.out.println("Soru sayısı: " + soruSayisi);

                if (puan >= 100) {
                    System.out.println("Tebrikler! Oyunu kazandınız.");
                    break;
                }
            }
        }
    }


