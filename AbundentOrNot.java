import java.util.Scanner;
class AbundentOrNot{

    
public static int getSumOfFactor(int n){
    int sum = 0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum = sum+i;
        }
    }
    return sum;
}

    public static void abundentOrNot(int n){
        if(getSumOfFactor(n)>n){
            System.out.println("Abundent Number");
        }
        else{
            System.out.println("Not Abundent Number");
        }

    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int n =scan.nextInt();
        abundentOrNot(n);
    }
}




