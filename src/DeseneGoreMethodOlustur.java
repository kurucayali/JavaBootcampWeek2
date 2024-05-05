// Kullanıcıdan değer alıyoruz. bu değerden 5 çıkartarak 0 a kadar veya - değer alana kadar gidiyoruz.
// Sonra tekrar 5 ekleyerek ilk değere kadar tekrar çıkmamız isteniyor.

import java.util.Scanner;

public class DeseneGoreMethodOlustur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt(); // n değerini aldık

        numberRecursive(n);
    }
    //Method oluşturduk. Eğer n değeri 0 dan büyükse recursive tekrarlansın
    static void numberRecursive(int n) {

        if (n > 0) {
            System.out.print(n + " ");// if döngüsüne giren n i yazdırdık.
            numberRecursive(n - 5); // koşul sağlanırsa n'den 5 çıkartıp tekrar methodu çağırdık.
            System.out.print(n + " ");// if döngüsüne giren n i tekrar yazdırdık. Böylece +5 e ihtiyaç duymadık.
        } else {
            System.out.print(n + " ");
        }
    }
}


