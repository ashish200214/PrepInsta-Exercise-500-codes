import java.util.Scanner;
class LeapYear{
	//using if-else 
	static void usingIfelse(int year){
		if(year%400 == 0)
			System.out.println("Leap Year");
		else if(year%4==0 && year%100!=0)
			System.out.println("Leap Year");
		
		else
			System.out.println("Not A Leap Year");
	}

	//using other ifelse
	static void anotherIfelse(int year) {
		if(year % 400 == 0 || (year %4 ==0 && year%100!=0))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}

	//using ternaryOperator

	static void ternaryOperator(int year) {
		String leap = (year % 400 ==0 ||(year%4 ==0 && year%100!=0))?"Leap Year":"Not Leap year";
		System.out.println(leap);
	}

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year :- ");
		int year = scan.nextInt();

		ternaryOperator(year);


	}
}