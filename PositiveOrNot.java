class PositiveOrNot{

	//using bruth force method
	static void positiveOrNot(int num) {
		if(num>0)
			System.out.println("Given Number is Positive");
		else if (num<0) {
			System.out.println("Given Number is Negative");
		}
		else{
			System.out.println("Given Number is Zero");
		}
	}

	//using nested if-else method
	static void positiveOrNotUsingNested(int num){
		if(num >= 0){
			if(num==0){
				System.out.println("Number is zero");
			}
			else{
				System.out.println("Number is Positive");
			}

		}
		else{
			System.out.println("Number is Negative");
		}

	}

	//using ternary operator
	static void usingTernary(int num) {

		if(num==0){
			System.out.println("Number is zero");
		}
		else{
			String result = num > 0 ? "Number is positive" : "Number is Negative";
			System.out.println(result);
		}
	}

	public static void main(String[]args){
		//positiveOrNot(-1);
		//positiveOrNotUsingNested(0);
		usingTernary(0);
	}
}