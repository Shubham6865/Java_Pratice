import java.util.*;

public class EvenOddCheck {

  public static void main(String args[]) {

    System.out.print("Enter number to check");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.print(num + "is even");
    } else {
      System.out.print(num + "is odd");

    }
    sc.close();
  }
}
