public class BinomialCoefficient{

  public static void main(String args[]){
    BinomialCoeff(5,2);
  }
  
  public static void BinomialCoeff(int n, int r){
    
    float bino = factorial(n)/(factorial(r)*(factorial(n-r))); 
    System.out.println(bino);
  }

  public static int factorial(int num){
    int fact = 1;
    for(int i = 1; i<=num; i++){
      fact *= i;
    }

    return fact;
  }

}