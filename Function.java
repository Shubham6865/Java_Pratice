public class Functions{
  public static void main(String args[]){
    
    // sum();
    System.out.println("Sum of a and b : "+ sum(20,40));
    System.out.println("factorial of num : "+ factorial(5));

  }


  public static int sum (int a, int b){
  return a+b;
  }

  public static int factorial(int num){

    int sum =1;
    for(int i = 1; i<=num; i++){
      sum = sum* i;
    }
    return sum;
  }
}