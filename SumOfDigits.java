import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args) {
        int sum=0,number;
        System.out.print("Enter a number: ");  
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();  

        while(number!=0){
            sum += number%10;
            number = number/10;

        }
        System.out.println(sum);
    }
    
}