import java.util.Scanner;
class ArmstrongRange{
	//to getOrder of number

	static int getOrder(int n){
		int count =0;
		while(n!=0){
			count++;
			n = n/10;
		}
		return count;
	}

	//armstrong number 
	static void armStrong(int initial,int final1){
		for(int i=initial;i<=final1;i++) {
			int rem,order,temp,sum=0;
			order = getOrder(i);
			temp=i;
			while(temp!=0){
				rem = temp%10;
				sum = sum+(int)Math.pow(rem,order);
				temp = temp/10;
			}
			if(sum == i){
				System.out.println(i+" Armstrong Number ");
			}
		}
	}

	//using recursion //getting wrong
	static int usingRecursion(int n,int sum,int order){
		int rem;
		
		if(n!=0){
			rem = n%10;
			sum = sum+(int)Math.pow(rem,order);
			return sum+usingRecursion(n/10,sum,getOrder(n));
		}
		else{
			return 0;
		}
	}

	//printing armstrong passing to usingRecursion()

	static void print(int initial,int final1){
		int i,temp;
		for(i=initial;i<=final1;i++){
			temp = usingRecursion(i,0,getOrder(i));
			if(i==temp){
				System.out.println(i+" Armstrong Number");
			}

		}
	}

	public static void main(String[]args) {
		int n1=1,n2=1000,temp;
		
		print(n1,n2);
	}
}