import java.util.Scanner;
public class AutomorphicOrNot {
    static int square(int n){
        return n*n;
    }

    public static void automorphicOrNOt(int n){
        if(square(n)%10 == n%10){
            System.out.println("Number is automorphic");

        }
        else{
            System.out.println("Number is not automorphic");
        }
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No :- ");
        int n = scan.nextInt();
        
        automorphicOrNOt(n);
    }
}
