Напишите программу, которая считывает массив целых чисел и целое число. Программа должна проверить, содержит ли массив это число.

Формат входных данных

Первая строка: размер массива.

Вторая строка: все элементы массива, разделенные пробелом.

Третья строка: одно целое число.

Формат выходных данных

Только одно значение: true или false .
  
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        boolean result = false;
        for (int numbs : arrays) {
            if (numbs == number) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}





















