import java.util.Scanner;
class PerfectOrNot{
    public static void perfectOrNot(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==n){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = scan.nextInt();
        
        perfectOrNot(n);
        scan.close();
    }

}
