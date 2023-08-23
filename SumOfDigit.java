class SumOfDigit{
	//using bruteforece method

	static int bruteForce(int n){
		int remainder=0;
		int sum = 0;
		while(n!=0)
		{
			remainder = n%10;
			sum = sum + remainder;
			n = n/10;
		}
		return sum;
	}

	//using recursion
	static int usingRecursion(int n,int sum){
		if(n!=0){
			sum = sum + (n%10); //9
			return usingRecursion(n/10,sum);
		}
		else{
			return sum;
		}
			

	}

	//using ASCII 
	static void ascii(String num){
		int sum = 0;
		for(int i=0;i<num.length();i++){
			sum = sum+num.charAt(i)-48;
		}
		System.out.println("addition is "+sum);
	}

	public static void main(String[]args) {
		String n="12345";
		ascii(n);
		//System.out.println(usingRecursion(n,0));
	}

	static void SumOfDigit(String n){
		int sum = 0;
		for(int i=0;i<n.length();i++){
			sum = sum+Integer.parseInt(String.valueOf(n.charAt(i)));
		}
	}
}
