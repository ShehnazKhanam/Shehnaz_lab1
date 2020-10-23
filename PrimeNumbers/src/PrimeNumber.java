import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.out.println("Enter the number till which prime number to be printed: ");
	      int limit = new Scanner(System.in).nextInt();
	      System.out.println("Printing prime number from 1 to " + limit);
	      for(int number = 2; number<=limit; number++){

	          if(isPrime(number)){
	              System.out.println(number);
	          }
	      }
	}

	    public static boolean isPrime(int number){
	        for(int i=2; i<number; i++){
	           if(number%i == 0){
	               return false; //number is divisible so its not prime


	}

}
	        return true;
}
}