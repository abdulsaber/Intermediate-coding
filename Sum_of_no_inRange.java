import java.util.Scanner;

public class Sum_of_no_inRange {
    public static void main(String[] args) {
        System.out.println("Enter the range to find their sum(range a-b):\nEnter the value of a:");
        int a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();

        for(int i=a;i<=b;i++){
            sum= i;
        }
        System.out.println("The sum of numbers in range "+a+"-"+b+" is "+ sum);


        
    }

    
}