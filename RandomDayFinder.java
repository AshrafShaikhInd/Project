import java.util.Scanner;
public class RandomDayFinder {
  public static void main(String[] args) {
    int i = 1;
    Scanner j = new Scanner(System.in);
    System.out.println("Enter the number of Random Dates you want : ");
    int k = j.nextInt();
    if (k > 30) {
      System.out.println("We can't generate More than 30 days.");
    }
    while (i <= k && k <= 30) {
      int min = 1;
      int max = 7;
      int day = (int)(Math.random()*(max-min+1)+1);
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednsday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
      }
      i++;
    }
    j.close();
  }
}