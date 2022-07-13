import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = a % n == 0 ? b / n - a / n + 1 : b / n - a / n;

        System.out.println(sum);
    }
}
//Напишите программу, которая считывает три положительных целых числа a, b, n и выводит количество чисел, кратных n , в диапазоне от a до b (a < b) включительно.
