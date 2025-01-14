
public class StarPattern {

  public static void main(String args[]) {

    int num = 4;

    System.out.println("-------------------problem 1------------------------------");
    System.out.println("Simple Star pattern");
    for (int i = 1; i <= num; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println("");
    }

    System.out.println("------------------problem 2-------------------------------");
    System.out.println("inverted star pattern");
    for (int i = 1; i <= num; i++) {

      for (int j = num; j >= i; j--) {
        System.out.print("*");
      }

      System.out.println("");
    }
    System.out.println("----------------problem 3---------------------------------");
    System.out.println("number pattern");

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println("----------------problem 4---------------------------------");
    System.out.println("Character pattern");
    char ch = 'X';

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch++);
        if (ch > 'Z') {
          ch = 'A';
        }
      }
      System.out.println();
    }
  }
}