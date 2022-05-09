import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num, rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        if(getReverse(num, rev)==num){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println(num+" is not Palindrome");
        }
    }
    static int getReverse(int num, int rev){
        if(num==0){
            return rev;
        }else{
            int rem = num % 10;
            rev = rev * 10 + rem;
            return getReverse(num/10, rev);
        }
 
    }
    
}
