//In friendly pair sum of the factor of the  number is divisible by its number ==
//sum of the factor of the other number is divisible by its number then its called friendly pair

/*
 * Example
Input : 6 28
Output : Yes, they are a friendly pair
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively. 
When we divide the sums with the numbers we get 1 and 1 respectively. 
As the ratio of both the number match, they are considered as a friendly pair.
 */

public class FriendlyPair {
    
    public static int getSumOfFactor(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void checkFriendlyPair(int n,int n1){
        int num1 = n;
        int num2 = n1;
        if(num1/getSumOfFactor(n)==num2/getSumOfFactor(n1)){
            System.out.println("Pair is Friendly Pair");
        }
        else{
            System.out.println("Pair is not Friendly Pair");
        }
    }

    public static void main(String[]args){
        checkFriendlyPair(30, 40);
    }
}

