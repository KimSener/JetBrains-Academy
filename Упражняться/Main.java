import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                number += 1;
            }

        }
        System.out.println(sum / number);
    }
}