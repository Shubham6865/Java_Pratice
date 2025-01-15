
public class PrimeNumber{
  public static void main (String args[]){

    int num= 7;
    int prime = 0;
    
    // for(int i = 2; i<num;i++){
    // or
    for(int i = 2; i<Math.sqrt(num);i++){

      if(num%i==0){
        prime +=1;
        break;
      }
    }

    if(prime>0){
      
      System.out.print("Number is not prime");
    }
    else{
      System.out.print("Number is prime");
    }
  }
}