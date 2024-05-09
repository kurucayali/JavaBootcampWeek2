import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SayiTahmini3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int targetValue = random.nextInt(101); // 0 ile 100 arası bir sayı oluşturuyoruz
        int guessChances = 5;
        int[] guessArr = new int[5]; // Kullanıcının daha önce girdiği değerleri tutmak için bir dizi oluşturuyoruz
        int guessArrIndex = 0; // Dizideki sonraki boş indeks

        System.out.println("0-100 arasında bir sayı tahmin edin.");

        while (guessChances > 0) {
            System.out.print("Tahmininiz: ");
            int guessValue = input.nextInt();

            // Aralık dışında bir değer girilirse döngünün başına dön.Yani kaydı alma while döngüsünü yenile.
            if (guessValue < 0 || guessValue > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
                continue;
            }
            guessArr[guessArrIndex] = guessValue; // Kullanıcının tahminini dizide tutuyoruz
            guessArrIndex++;

            if (guessValue == targetValue) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break; // Doğru tahmin edildiğinde döngüden çık
            } else {
                if (guessValue > targetValue) {
                    System.out.println("Gizli sayı, " + guessValue + " sayısından küçüktür.");
                } else {
                    System.out.println("Gizli sayı, " + guessValue + " sayısından büyüktür.");
                }
                guessChances--; // Tahmin hakkını azalt
                System.out.println("Kalan tahmin hakkınız: " + guessChances);
            }
        }

        // Tahminlerin tümünü ekrana yazdır

        System.out.print("Tahminleriniz: ");
        for (int i = 0; i < guessArrIndex; i++) {
            System.out.print(guessArr[i] + " ");
        }

        if (guessChances == 0) {
            System.out.println("\nÜzgünüm, tahmin hakkınız kalmadı. Doğru cevap: " + targetValue);
        }
    }
}
