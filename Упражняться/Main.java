import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if ((i % 5 == 0 && i % 3 == 0)) {
                System.out.println("FizzBuzz"); // при деление на 3 и 5

            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // при деление на 5

            } else if (i % 3 == 0) {
                System.out.println("Fuzz"); // при деление на 3

            } else {
                System.out.println(i); //  для вывода остатка цифр не делящие ни на 3 и 5 вместе или отдельно
            }

        }

    }
}