// Kullanıcı tarafından girilen sayının asal olup olmadığını recursive mehodla bulacağız.

import java.util.Scanner;
public class AsalSayilarWithRecursive {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Kullanıcıdan bir sayı alalım
    System.out.print("Sayı Giriniz: ");
    int number = input.nextInt();

    // isPrime fonksiyonunu kullanarak sayının asal olup olmadığını kontrol edelim
    if (isPrime(number, 2))
        System.out.println(number + " sayısı ASALDIR !");
    else
        System.out.println(number + " sayısı ASAL değildir !");
}

    // Recursive olarak asal sayı kontrolü yapan fonksiyon
    static boolean isPrime(int number, int divisor) {
        // Sayı 1'den küçükse asal değildir
        if (number <= 1)
            return false;

        // Bölen, sayının kendine eşitse sayı asaldır
        if (divisor == number)
            return true;

        // Eğer sayı bölenin tam katıysa, asal değildir
        if (number % divisor == 0)
            return false;

        // Başka bir bölen için recursive olarak fonksiyonu tekrar çağır
        return isPrime(number, divisor + 1);
    }
}