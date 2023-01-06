package Projeler;

import java.util.Scanner;

public class Java07 {
    //sparişMenü

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lokantamiza hosgeldiniz. Siparis vermek icin 1e basin."
                + "Cikmak icin 2 ye basin: ");
        int tercih = klavye.nextInt();

        if(tercih == 2)
        {
            System.out.println("Hoscakalin. Yine bekleriz!");
        }
        else if(tercih==1)
        {
            System.out.println("Corbalar icin 1");
            System.out.println("Burgerler icin 2");
            System.out.println("Kebaplar icin 3");
            System.out.println("Salata icin 4");
            System.out.println("Tatli icin 5");
            System.out.println("Cikmak icin 6 ya basin:");
            tercih = klavye.nextInt();
            if(tercih==6)
            {
                System.out.println("Hoscakalin. Yine bekleriz!");

            }
            else if(tercih==1)
            {
                System.out.println("Mercimek corbasi icin 1");
                System.out.println("Yayla corbasi icin 2");
                System.out.println("Ezogelin corbasi icin 3");
                System.out.println("Domates corbasi icin 4");
                System.out.println("Cikmak icin 5 ya basin:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih<=4) {
                    System.out.println("Afiyet olsun. Corbaniz Hazir!");
                }
                else
                    System.out.println("Hoscakalin. Yine bekleriz!");
            }
            else if(tercih==2)
            {
                System.out.println("Hamburger  icin 1");
                System.out.println("Cheeseburger  icin 2");
                System.out.println("Double King Menu  icin 3");
                System.out.println("Cikmak icin 4 ya basin:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih<=3) {
                    System.out.println("Afiyet olsun. Burgeriniz Hazir!");
                }
                else
                    System.out.println("Hoscakalin. Yine bekleriz!");
            }
            else if(tercih==3)
            {
                System.out.println("Adana Kebap  icin 1");
                System.out.println("Beyti Kebap  icin 2");
                System.out.println("Urfa Kebap  icin 3");
                System.out.println("Yogurtlu Kebap  icin 4");
                System.out.println("Cikmak icin 5 ya basin:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih<=4) {
                    System.out.println("Afiyet olsun. Kebabiniz Hazir!");
                }
                else
                    System.out.println("Hoscakalin. Yine bekleriz!");

            }
            else if (tercih==4) {
                System.out.println("Amerikan salatasi icin 1");
                System.out.println("Turk salatasi icin 2");
                System.out.println("Etli salata icin 3");
                System.out.println("Cikmak icin 4 e basiniz:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih <=3) {
                    System.out.println("Afiyet olsun. salataniz hazir! ");

                }


                else{
                    System.out.println("Hoscakalin. Yine bekleriz! ");

                }
            }
            else if (tercih==5) {
                System.out.println("kadayif tatlisi icin 1\nhalka takli icin 2 \nbilluriye tatlisi icin"
                        + " 3 \nfistikli tatli icin 4 \ncikmak icin 5 e basiniz : ");
                tercih = klavye.nextInt();

                if(tercih>=1 && tercih<=4) {
                    System.out.println(" Afiyet olsun tatliniz hazir! ");
                }
                else {
                    System.out.println("Hoscakalin. Yine Bekleriz!");
                }

            }










        }
    }
}
