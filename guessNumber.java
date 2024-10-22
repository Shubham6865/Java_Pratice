import java.util.Scanner;

public class guessNumber {

  public static void main(String[] args) {

    int target = (int) ((Math.random() * 100) + 1);
    int count = 1;

    Scanner sc = new Scanner(System.in);
    System.out.println(target);
    while (true) {

      System.out.print("Enter Num between 1 to 100: ");
      int guess = sc.nextInt();

      if (guess > 100 || guess < -1) {
        System.out.println("Enter vaild no between 1 to 100");
        break;

      } else if (guess == -1) {

        System.out.println("Thanks");
        break;
      }

      if (guess > target) {
        System.out.println("Guess is to high");
        count++;

      } else if (guess < target) {
        System.out.println("Guess is to low");
        count++;

      } else {

        System.out.println("congo you found target");
        System.out.println("You have guess correct target in : " + count + " guesses");
        break;
      }
    }
    sc.close();
  }
}