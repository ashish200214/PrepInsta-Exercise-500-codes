class EvenOdd{
	//using if-else
	static void usingLoop(int n){
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

	//using ternary
	static void usingTernary(int n){
		System.out.println((n%2==0) ? "even" : "odd");
	}

	//using bitwise and operator
	static boolean usingBitwise(int n) {
		return (!(n & 1));
	}

	public static void main(String[]args) {
		boolean e= usingBitwise(2);
		System.out.println("the given number is even = "+e);
	}
}