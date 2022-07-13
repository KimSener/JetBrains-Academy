import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int inputUser = scanner.nextInt();
            if (inputUser == 0) {
                sum1 += 1;
            } else if (inputUser == 1) {
                sum2 += 1;
            } else if (inputUser == -1) {
                sum3 += 1;
            }

        }
        System.out.print(sum1 + " ");
        System.out.print(sum2 + " ");
        System.out.print(sum3);

    }

}




