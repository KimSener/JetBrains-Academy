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
/*Дана последовательность натуральных чисел, не превосходящая 30000. Найдите максимальный элемент, кратный 4. В последовательности всегда есть элемент, кратный 4, и количество элементов не превосходит 1000.

На вход программа получает количество элементов в последовательности n (первая строка), а затем сами элементы (следующие n строк). Программа должна вывести единственное число: максимальный элемент последовательности, кратный 4.

Попробуйте решить эту проблему, используя цикл for.**/

