import java.util.Scanner;

public class Reverse_a_num {
    public static void main(String[] args) {
        int num, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it:");
        num = sc.nextInt();
        System.out.println("Reversed Number: "+ getReverse(num, rev));
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
