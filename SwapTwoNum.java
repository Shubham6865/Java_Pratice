
public class SwapTwoNum{
  public static void main (String args[]){
    // Write a program to swap two numbers without using a third variable.

    int num1 = 10;
    int num2 = 20;

    System.out.println(num1 +","+ num2 );
  //with third varibale
  //  [ int temp = num1;
  //   num1 = num2;
  //   num2 = temp;]

  num1 = num1+num2;
  num2 = num1-num2;
  num1 = num1-num2;




    System.out.println(num1 +","+ num2 );
  }
}