Напишите программу, которая печатает часть последовательности 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (число повторяется столько раз, сколько оно равно). 
Входные данные для программы — положительное целое число n: количество элементов последовательности, которую программа должна напечатать. 
Выведите последовательность чисел, записанную в одну строку через пробел.
Например, если n = 7, то программа должна вывести 1 2 2 3 3 3 4.
  
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                if (sum == inputNumber) {
                    break;
                }
                System.out.print(i + " ");
                sum++;
            }
        }
    }

}




