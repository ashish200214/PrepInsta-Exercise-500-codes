class Armstrong {
	static int getOrder(int n){
		int length = 0;
		while(n!=0){
			length++;
			n = n/10;
		}
		return length;
	}

	//checking no is armstrong or not
	static void armstrong(int n,int len){
		int rem,sum=0,temp = n;
		while(n!=0){
			rem = n%10;
			sum=sum+(int)Math.pow(rem,len);
			n = n/10;
		}

		if(temp == sum){
			System.out.println("Aromstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}


		//using recursion
		static int usingRecursion(int n,int sum,int len) {
			int rem;
			if(n!=0){
				rem = n%10;
				sum = sum+(int)Math.pow(rem,len);
				System.out.println(sum);
				return usingRecursion(n/10,sum,len);
			}
			else{
				return sum;
			}
		}

	
	public static void main(String[]args){
		//System.out.println(getOrder(1234));
		int n=1634;
		int temp = getOrder(n);
		//armstrong(n,temp);
		if(n == usingRecursion(n,0,temp)){
			System.out.println("ArmStrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}

	}
}