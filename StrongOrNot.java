import java.util.Scanner;
class StrongOrNot{
  //finding factorial
    static int getFactorial(int n){
        
        if(n<=0 && n==1){
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact = fact * i;
            }
            return fact;
        }
    }

    //checking whether number is strong or not.
    public static boolean Strong(int n){
        int temp = n, rem,sum=0;
        while(n!=0){
            rem = n%10;
            sum=sum+getFactorial(rem);
            n = n/10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
    }

        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number :- ");

            int n = scan.nextInt();

            if(Strong(n)){
                System.out.println("Number is strong");
            }
            else{
                System.out.println("Number is not strong");
            }
            scan.close();

        }
}
