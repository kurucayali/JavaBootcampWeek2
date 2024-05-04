// Fibonacci serisinde kullanıcının istediği sıradaki değeri ekrana bastır.

import java.util.Scanner;
// Recursive method
public class RecursiveFibonacci {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci dizisinde öğrenmek istediğiniz sıra sayısınızı giriniz.:");
        int n = input.nextInt();

        System.out.print(fib(n));

}
}
