// 0-100 arası sayı tahmin oyunu. Kullanıcının 5 giriş hakkı var. Tahmin etmesini bekliyoruz.

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int targetValue = random.nextInt(100);
        int guessChances = 5;
        System.out.print(targetValue);
        System.out.println();

        System.out.print("0-100 arasında değerler girerek sayıyı tahmin etmeye çalışın\n" +
                "Tahmininiz giriniz.: ");
        int guessValue = input.nextInt();

        while (targetValue != guessValue) {
            guessChances--;
            System.out.println("Hatalı giriş yaptınız!");
            if (guessValue > targetValue) {
                System.out.println(guessValue + " sayısı, gizli sayıdan büyüktür.");
            } else {
                System.out.println(guessValue + " sayısı, gizli sayıdan küçüktür.");
            }
            System.out.print(guessChances +" Deneme hakkın kaldı!\n" +
                    "Tekrar deneyiniz.: ");
            guessValue = input.nextInt();

            if (guessValue == targetValue) {
                System.out.print("Tebrikler kazandınız! ");
                break; // Oyunu kazanıldığında döngüden çık
            }
            if (guessChances == 1) {
                System.out.print("KAYBETTİNİZ!");
                break;
            }

        }
        if(targetValue==guessValue){
            System.out.print("Çok şanslısın ilk tahmininde kazandın!! ");
        }

    }
}
