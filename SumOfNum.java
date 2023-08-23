class SumOfNum{
	//using loop
	static int usingLoop(int initial, int final1){
		int sum =0;
		for(int i=initial;i<=final1;i++){
			sum=sum+i;
		}//for
		return sum;
	}	//usingLoop

	//using formula
	static int usingFormula(int i,int f){
		int result = (i*(i+1)/2)-(f*(f+1)/2+i);
		return result;
	} //using formula

	//using recursion
	static int usingRecursion(int i, int d,int sum){
		if(i<d) {
			return i+usingRecursion(i+1,d,sum);
			
		} //if
		else{
			return sum;
		} //else
	}//usingRecursion

	public static void main(String[]args) {
		int sum= usingRecursion(1,5,0);
		System.out.println(sum);
	}//main
}//class

