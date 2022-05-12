import java.util.Scanner;

public class armstrongno_range {
    public static void main(String[] args) {
        int low,high;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower and upper ranger:");
        low = sc.nextInt();
        high = sc.nextInt();
        
        System.out.println("The armstrong numbers between "+low+" and "+high+" are:");

        for(int num = low; num <= high ;num++){
            int sum = 0, temp, digit,len;
            len = order(num);
            temp = num;

            while(temp!=0){
            digit = temp % 10;
            sum = (int)(sum + Math.pow(digit, len));
            temp /= 10;
            }
            if(num==sum){
                System.out.println(num +" ");
            }

        }
    }
    public static int order(int num){
        int len = 0;
        while(num!=0){
            len++;
            num = num / 10;
        }
        return len;
    }
    



    
    
}