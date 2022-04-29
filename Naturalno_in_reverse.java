import java.util.Scanner;

public class Naturalno_in_reverse {
    public static void main(String[] args) {
        int N,i;
        System.out.println("Enter the no of natural numbers to find its reverse order:");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(i=N;i>0;i--){
            System.out.println(i);
        }
    }


    
}