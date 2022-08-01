Напишите программу, которая вводит в цикл последовательность целых чисел и вычисляет их сумму при следующих условиях:

1) если новое число равно 0, программа должна остановить цикл и вывести накопленную сумму;

2) если сумма равна или превышает предел 1000, программа также должна прекратить чтение чисел и вывести значение, равное сумме минус 1000.

Примечание: ввод может содержать дополнительные числа. Просто игнорируйте их.
  
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 1000;
        while (scanner.hasNextInt()) {
            int numb = scanner.nextInt();
            sum += numb;
            if (numb == 0) {
                System.out.println(sum);
                break;
            }

            if (sum >= max) {
                System.out.println(sum - max);
                break;
            }

        }

    }

}

