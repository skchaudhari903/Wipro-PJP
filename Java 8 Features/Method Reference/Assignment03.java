/*Define your own class and a parameterized constructor with one integer argument. It should check the argument and display "Prime" or "Not Prime". 
Define your own functional interface to refer this constructor and invoke it to check whether the given number is Prime or Not.
*/

interface PrimeReference {
	void checkPrime(int n);
}

public class Assignment03 {
	
	Assignment03(int n) {
		int flag = 0;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if( n % i == 0){
				flag = 1;
			}
		 }
		if(flag == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeReference ref = Assignment03 :: new;		
		ref.checkPrime(8);
		ref.checkPrime(23);
	}

}
