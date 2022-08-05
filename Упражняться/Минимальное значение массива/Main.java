Напишите программу, которая читает массив целых чисел и находит минимальное значение массива.

Формат входных данных

Первая строка содержит размер массива.
Вторая строка содержит элементы массива, разделенные пробелами.

Формат выходных данных

Целое число, представляющее минимум во входном массиве.
  
 Пример ввода 5
  5
  1
  4
  2
  3
  Пример вывода 1
  
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = scanner.nextInt();

        }
        int min = arrays[0];
        for (int numbs : arrays) {
            min = Math.min(numbs, min);

        }
        System.out.println(min);

    }
}
