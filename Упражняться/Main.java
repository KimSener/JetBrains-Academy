import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    int mealsperday = scanner.nextInt();
    int onewayflight = scanner.nextInt();
    int costofonenightinahotel = scanner.nextInt();
    int hotel = costofonenightinahotel*(day-1);
    int eat = mealsperday*day;
    int fly2 = onewayflight*2;
    System.out.println(hotel+eat+fly2);


  }
}