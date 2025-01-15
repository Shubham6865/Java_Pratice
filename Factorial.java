public class Factorial{
  public static void main(String args[]){
    
    System.out.println("factorial of num : "+ factorial(5));

  }
  
  public static int factorial(int num){
    int sum =1;
    for(int i = 1; i<=num; i++){
      sum = sum* i;
    }
    return sum;
  }
}