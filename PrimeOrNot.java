class PrimeOrNot{
	//using iterative method

	static void primeOrNot1(int n) throws IllegalArgumentException{
		int count = 0;
		if(n ==0 )
			throw new IllegalArgumentException("Do not enter 0 number");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}

		if(count == 2){
			System.out.println(n+" is Prime Number");
		}
		else{
			System.out.println(n+" is not Prime Number");
		}
	}

	//usin break 
	static void primeOrNot2(int n) {
		boolean isPrime = true;

		if(n <2)
			isPrime = false;
		else{
			for(int i=2;i<n;i++)
			{
				if(n%i ==0)
				{
					isPrime = false;
					break;
				}
			}
			System.out.println(isPrime == true ? "Number is Prime":"Number is not Prime");
		}
	}

	//using interating from [2,n/2]

	static void primeOrNot3(int n){
		boolean isPrime = true;
		
		if(n<2){
			isPrime = false;
		}		
		else{
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					isPrime =false;
				}
			}
		}

		System.out.println(isPrime == true ? "Prime Number":"Not Prime Number");

	}

	//using iterate loop [2,squrt(n)]

	static void primeOrNot4(int n){
		boolean isPrime = true;
		if(n<2)
			isPrime = false;
		else{
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0)
				{
					isPrime = false;
				}
			}
		}
		System.out.println(isPrime == true ? "Prime":"Not Prime");
	}
	//using without iteration
	static boolean primeOrNot5(int n){

		if(n<=1)
			return  false;
		else if(n==2)
			return true;
		else{
			for(int i=3;i<=Math.sqrt(n);i++){
				if(n%i==0)
					return  false;
			}
		}
		return true;

		
	}

	//using recursion function

	static boolean usingRecursion(int n,int i){
		if(n<=1)
			return false;
		if(n==i)
			return true;

		if(n==2)
			return true;

		if(n%i==0)
			return false;
		i=i+1;
		return usingRecursion(n,i);
	}

	public static void main(String[]args) {
		boolean f=usingRecursion(40,2);
		if(f==true){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not Prime Number");
		}
	}

}