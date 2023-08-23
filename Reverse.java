class Reverse{
	static void usingWhile(int n) {
		int rem,reverse = 0;
		while(n!=0)
		{	
			rem = n%10;
			reverse = reverse * 10+rem;
			n=n/10;
		}
		System.out.println("Reverse of number is : "+reverse);
	}

	static void usingFor(int n) {
		int rem,reverse = 0;
		for(;n!=0;n=n/10){
			rem = n%10;
			reverse = reverse*10+rem;
		}
		System.out.println(reverse);
	}

	//using recusrsion
	static int usingRecursion(int n,int reverse){

		if(n!=0){
			int rem ;
			rem = n%10;
			reverse = reverse * 10+rem;
			return usingRecursion(n/10,reverse);
			//n/10;
		}
		else{
			return reverse;
		}

	}

	//using another recursion
	static void usingRecursion2(int num) {
		if(num==0){
			return ;
		}
		else{
			int rem = num%10;
			System.out.print(rem);
			usingRecursion2(num/10);
		}
	}
	
	public static void main(String[]args) {
		usingRecursion2(1234);

	}
}