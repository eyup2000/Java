package Projeler;

import java.util.Scanner;

public class Java_Alıştirma4 {
    public static void main(String[] args) {
        /*
        Kullanicidan Kullanici adi ve sifreyi girmesini isteyin "Lutfen kullanici adi ve sifrenizi giriniz"
        Eger kullanici dogru bilgileri girer ise, ona "Hesabiniza giris yaptiniz" mesaji
        Kullanici 3 kereye kadar yanlis Kullanici adi ve sifre girer ise ona "Lutfen kullanici adi ve sifrenizi giriniz" mesaji veriniz
        Kullanici 3 ve daha fazla sayida yanlis bilgiler girer ise "Hesabiniz bloke edildi" mesaji veren bir kod yaziniz

        Kullanici adi "admin", Sifre "sfr1234"
        */

        Scanner scan = new Scanner(System.in);

        String kullaniciAdi = "admin";
        String sifre = "sfr1234";

        int denemeSayisi = 0;

        while (denemeSayisi<3){


        System.out.println("Lütfen kullanıcı adınızı ve şifrenizi giriniz : ");

        System.out.print("Kullanıcı adı : ");
        String kullaniciAdiKisi = scan.nextLine();

        System.out.print("Şifre : ");
        String sifreKisi = scan.nextLine();



        if (kullaniciAdi.equals(kullaniciAdiKisi) && sifre.equals(sifreKisi)){

            System.out.println("Hesabiniza giris yaptiniz");

            break;

        }else{

            if (denemeSayisi>=2){
                System.out.println("Hata!! Kullanıcı adı veya şifrenizi 3 kez yanlış girdiniz");
                System.out.println("Hesabiniz bloke edildi");
            }else {
                System.out.println("Hata!! Kullanıcı adı veya şifrenizi kontrol ediniz");
            }
        }

        denemeSayisi++;

    }



    }
}
