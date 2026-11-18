import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(isLeapYear(y));
    }

    static boolean isLeapYear(int n){
        if(
            n % 100 == 0 &&
            n % 400 != 0
        ){
            return false;
        }

        if(n%4 == 0){
            return true;
        }else{
            return false;
        }
    }
}