Напишите программу, которая считывает массив целых чисел и целое число n .

Программа должна проверить, сколько раз n встречается в массиве.

Формат входных данных
Первая строка содержит размер входного массива.

Вторая строка содержит элементы массива, разделенные пробелами.

Третья строка содержит n .

Формат выходных данных

Результатом является только одно неотрицательное целое число.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int counter = 0;
        for (int n : arr) {
            if (n == num) {
                counter++;
            }
        }
        System.out.println(counter);

    }

}















