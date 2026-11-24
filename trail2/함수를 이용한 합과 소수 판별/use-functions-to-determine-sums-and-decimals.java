import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.println(checkCount(a, b));
    }

    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2; (long) i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    static boolean isEven(int n){
        return (n/10 + n%10)%2==0;
    }

    static int checkCount(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int count = 0;

        for(int i=min; i<=max; i++){
            if(isPrime(i)&&isEven(i)){
                count++;
            }
        }

        return count;
    }
}