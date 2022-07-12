import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt(); //Найдите сумму чисел, делящихся на 6, в заданной последовательности натуральных чисел.
        int sum = 0;                              //Первая строка ввода — это количество элементов в последовательности; следующие строки - это сами элементы.

        for (int i = 0; i < numberOfElements; i++) {  //Гарантируется, что в последовательности всегда есть число, кратное 6.
            int input = scanner.nextInt();// Второе ввод числа сканера осуществляется в цикле бесконечное число раз сколько введет пользователь
            if (input % 6 == 0) { // Проверка числа на кратность 6
                sum += input;
            }
        }
        System.out.println(sum);

    }
}