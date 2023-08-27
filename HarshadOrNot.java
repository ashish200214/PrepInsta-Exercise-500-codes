import java.util.Scanner;
//Harshad No :- Number which is divisible by the sum of individual digit then it is called harshadNo
public class HarshadNo {
    public static void harshadOrNot(int n){
        int rem,sum=0,temp=n;
        while(n!=0){
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(temp%sum ==0){
            System.out.println("Number is Harshad Number");
        }
        else{
            System.out.println("Number is Not Harshad Number");
        }
    }    

    public static void main(String[]args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int n = scan.nextInt();

        harshadOrNot(n);
        scan.close();
    }
}


