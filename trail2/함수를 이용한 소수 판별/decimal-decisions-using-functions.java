import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int sum = 0;

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        for(int i=min; i<=max; i++){
            if(isPrime(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    static boolean isPrime(int n) {
        if(n < 2){
            return false;
        }
        for(int i=2; (long) i*i <= n; i++){
            if (n % i == 0){
                return false;
            } 
        }
        return true;
}
}