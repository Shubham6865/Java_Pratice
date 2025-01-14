import java.util.*;

public class SimpleAddition {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first num");
    int num1 = sc.nextInt();
    System.out.println("Enter second num");
    int num2 = sc.nextInt();

    int sum = num1 + num2;

    System.out.print("sum : " + sum);

    sc.close();
  }
}