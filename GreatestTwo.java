class GreatestTwo{

	//using loop
	static void usingLoop(int n1,int n2) {
		if(n1>n2){
			System.out.println("n1 is greatest");
		}
		else{
			System.out.println("n2 is greatest");
		}
	}

	//using ternary operator
	static void usingTernaryOperator(int n1,int n2){
		System.out.println((n1>n2)?"n1 is greatest":"n2 is greatest");
	}

	//using Max method
	static void usingMax(int n1,int n2){
		System.out.println(Math.max(n1,n2)+"is greatest");
	}

	public static void main(String[]args) {
		//usingLoop(10,20);

		//usingTernaryOperator(20,10);

		usingMax(20,90);
	}
}

