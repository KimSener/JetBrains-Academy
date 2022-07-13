import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int numberUser = scanner.nextInt();
        for (int i = 0; i < numberUser; i++) {
            int input = scanner.nextInt();
            if (input % 4 == 0) {
                max = Math.max(input, max);
            }

        }
        System.out.println(max);
    }
}