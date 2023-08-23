class Palindrome{
	//using while
	static void palindromeOrNot(int n){
		int reverse = 0,rem,temp;
		temp=n;
		while(temp!=0){
			rem = temp%10;
			reverse = reverse *10+rem;
			temp=temp/10;
		}
		System.out.println(reverse);
		if(n == reverse){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome Number");
		}
	}

	//using recursion
	static int usingRecursion(int n,int rev){
		int rem;
		if(n!=0){
			rem = n%10;
			rev = rev * 10+rem;
			return usingRecursion(n/10,rev);
		}
		else{
			return rev;
		}
	}
	public static void main(String[]args) {
		//palindromeOrNot(1221);
		int n=1221;
		if(usingRecursion(n,0) == n){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}