Напишите программу, которая считывает массив целых чисел и два числа n и m . Программа должна проверить, что n и m никогда не встречаются рядом друг с другом (в любом порядке) в массиве.

Формат входных данных

Первая строка содержит размер массива.

Вторая строка содержит элементы массива.

Третья строка содержит два целых числа n и m .

Все числа в одной строке разделяются пробелом.

Формат выходных данных

Результатом является единственное логическое значение true , если n и m никогда не встречаются рядом друг с другом; в противном случае оно ложно .
  
  import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean result = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] == num1 && arrays[i + 1] == num2 || arrays[i] == num2 && arrays[i + 1] == num1) {
                result = false;
                break;
            }

        }
        System.out.println(result);
    }
}





















