import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please write the first name:");
      String firstname = scanner.nextLine();
      System.out.println("Please write the year so fexperience:");
      int yearsofexperience = scanner.nextInt();
      System.out.println("Please write the cuisine preference:");
      String cuisinepreference = scanner.next();
      System.out.print("The form for " + firstname + " is completed. We will contact you if we need a chef who cooks " + cuisinepreference + " dishes and has " + yearsofexperience + " years of experience.");



  }
}
