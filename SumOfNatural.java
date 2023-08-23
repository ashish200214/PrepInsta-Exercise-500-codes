class SumOfNatural{
	//using loop
	static int usingLoop(int n){
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

	//using formula
	static int usingFormula(int n){
		int sum = (n*(n+1)/2);
		return sum; 
	}

	//using Recursion
	static int usingRecursion(int n) {
		if(n!=0)
			return n+usingRecursion(n-1);
		else
			return n;
	}

	public static void main(String[]args) {
		int n= usingRecursion(5);
		System.out.println(n);
	}
}