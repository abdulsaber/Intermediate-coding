import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        checkPrime(n);
    }
    public static void checkPrime(int n){

        int count = 0;
        if(n<2){
            System.out.println("Prime number");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println(n+" : Prime number");
        }else{
            System.out.println(n+" : Not a prime number");
        }
    }
    
}
