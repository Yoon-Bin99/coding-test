import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(checkCount(a, b));
    }
    
    static boolean divTwo(int n){
        return n%2==0;
    }

    static boolean checkFive(int n){
        int first = n%10;
        return first==5; 
    }

    static boolean checkThree(int n){
        return n%3==0;
    }

    static boolean checkNine(int n){
        return n%9!=0;
    }

    static boolean checkBoth(int n){
        return checkThree(n)&&checkNine(n);
    }

    static boolean checkOn(int n){
        return !divTwo(n)&&!checkFive(n)&&!checkBoth(n);
    }

    static int checkCount(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int count = 0;

        for(int i=min; i<=max; i++){
            if(checkOn(i)){
                count++;
            }
        }

        return count;
    }
}