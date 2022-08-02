Дана последовательность положительных целых чисел (оканчивающаяся цифрой 0). Найдите наибольший элемент последовательности.

Само число 0 не входит в последовательность, а служит только знаком конца последовательности.
  
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNextInt()) {
            int numbs = scanner.nextInt();
            if (numbs == 0) {
                break;
            }
            max = Math.max(numbs, max);

        }
        System.out.println(max);
    }

}
