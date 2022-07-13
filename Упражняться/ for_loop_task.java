import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (; n > 0; n--) {
            String grade = scanner.next();
            if ("A".equals(grade)) {
                a++;
            } else if ("B".equals(grade)) {
                b++;
            } else if ("C".equals(grade)) {
                c++;
            } else if ("D".equals(grade)) {
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);


    }


}
Найдите количество оценок D, C, B и A за последний тест по информатике, где n учеников из класса успешно сдали тест.
Программа получает число n в качестве первой строки ввода, а затем получает сами оценки, каждую в новой строке.
Программа должна вывести четыре числа в одной строке: количество оценок D, C, B и A (в указанном порядке), разделенных пробелами.

