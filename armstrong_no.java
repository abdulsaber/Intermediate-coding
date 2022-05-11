import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        int len,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = sc.nextInt();
        len = order(num);

        if(armstro(num, len)){
            System.out.println(num+ " is armstrong");
        }else{
            System.out.println(num+ " is not armstrong");
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
    



    public static boolean armstro(int num, int len){
        int sum = 0, temp, digit;
        temp = num;

        while(temp!=0){
            digit = temp % 10;
            sum = (int)(sum + Math.pow(digit, len));
            temp /= 10;
        }
        return num==sum;

    }

}
