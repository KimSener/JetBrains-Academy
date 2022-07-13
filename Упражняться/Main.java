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

