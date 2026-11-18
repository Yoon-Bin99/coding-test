import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(power(a, b));
    }

    static int power(int a, int b){
        int answer = 1;

        for(int i=0; i<b; i++){
            answer *= a;
        }

        return answer;
    }
}