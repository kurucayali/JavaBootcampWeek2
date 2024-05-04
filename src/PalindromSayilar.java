// Palindrom sayı tersindende okunduğunda da aynı olan sayılara denir.
//Kullanıcıdan değer alıyoruz. Palindrom olup olmadığına dair bilgi veriyoruz.

import java.util.Scanner;

public class PalindromSayilar {

    //Bu method sayıyı ters çevirmek için yazılmıştır.
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) { // Eğer tersi kendine eşitse true dön
            return true;
        } else {
            return false; // değilse false dön
        }
    }

    // Kullanıcıdan değer alıp number'a eşitleyeceğiz ve methodu çalıştırıp sonucu vereceğiz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz.:");
        int number = input.nextInt();
        if (isPalindrom(number) == true) {
            System.out.print(number + " bir palindrom sayıdır");
        } else {
            System.out.print(number + " bir palindrom sayı değildir");
        }


    }
}
