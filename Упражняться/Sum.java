import java.util.Scanner;
class Sum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int a = number / 100;
    int b = number % 100 / 10;
    int c =number % 100 % 10;
    System.out.println(a+b+c);


  }
}