import java.util.Scanner;
class Num {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int number3 = scanner.nextInt();
    int number4 = scanner.nextInt();
    int number5 = scanner.nextInt();
    int number6 = scanner.nextInt();
    int min = (number1 * 60 + number2) * 60 + number3;
    int min2 = (number4 * 60 + number5) * 60 + number6;
    System.out.println(min2 - min);
  }
}
