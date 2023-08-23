import java.util.Scanner;
class PrimeInRange{
	static boolean isPrime(int n){
		if(n<2)
			return false;
		if(n==2)
			return true;
		for(int i=2;i<n;i++){
			if( n%i == 0)
			{
				return false;
			}
		}

		return true;
	}

	static void returnNumber(int initial, int final1){
		for(int i=initial;i<=final1;i++){
			if(isPrime(i))
			{
				System.out.print(i+"\t");
			}
		}
	}

	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the initial value");
		int num1 = scan.nextInt();

		System.out.println("Enter the final value");
		int num2 = scan.nextInt();

		returnNumber(num1,num2);
	}
}