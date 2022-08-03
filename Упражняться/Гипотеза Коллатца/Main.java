Для заданного натурального числа n , не превышающего 1_000_000, сгенерируйте последовательность целых чисел, описанную в гипотезе Коллатца:

Если n — четное число, разделите его пополам; если оно нечетное, умножьте его на 3 и прибавьте 1 . Повторяем эту операцию, пока не получим в результате цифру 1 .

Например, если число n = 17 , то последовательность выглядит следующим образом:

17 52 26 13 40 20 10 5 16 8 4 2 1
  
  import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 1) {
            System.out.print(number + " ");

            number = number % 2 == 0 ? number / 2 : (3 * number) + 1;
        }

        System.out.print(number);
    }

}
