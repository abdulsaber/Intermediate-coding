import java.util.Scanner;

public class sum_of_N_naturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find the sum of n Natural numbers:");
        int n = sc.nextInt();
        Natural(n);

    }
    public static void Natural(int n) {
        int sum = (n*(n+1))/2;
        System.out.println("Sum of "+n+" natural numbers is "+sum);
        
    }

    
}