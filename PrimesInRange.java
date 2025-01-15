public class PrimesInRange{

  public static void main (String args[]){

    int num =10;

   for(int i = 2; i<=num;i++){
    
      if(isPrime(i)){
        System.out.print(i +" ");
      }

    }
      System.out.println();
  }

  public static boolean isPrime(int num){
    for(int i =2; i<=Math.sqrt(num);i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}