import java.util.Scanner;
class GreatestThree {
	//if-else

	static void usingIfelse(int num1, int num2, int num3) {
		if(num1 >=num2 && num1>=num3) {
			System.out.println(num1+" Number is greatest.");
		}
		else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2+" Number is greatest");
		}
		else{
			System.out.println(num3+" Number is greatest");
		}
	}

	//using another ternary operator
	static void usingTernary(int num1,int num2, int num3){

		int temp = num1>num2 ? num1:num2;

		int result = temp>num3 ? temp:num3;

		System.out.println(result+" is greatest"); 
	}

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three Values :- ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		usingIfelse(num1,num2,num3);
	}
}