import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(check(n));
    }

    static boolean five(int num){
        if((num%10 + num/10)%5 == 0){
            return true;
        }else{
            return false;
        }
    }

    static boolean even(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    static String check(int num){
        if(five(num) && even(num)){
            return "Yes";
        }else{
            return "No";
        }
    }
}