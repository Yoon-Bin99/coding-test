import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = 0;

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        for(int i=min; i<=max; i++){
            if(checkThree(i) || isContain(i)){
                count++;
            }
        }

        System.out.println(count);

    }

    static boolean checkThree(int n){
        if(n%3 == 0){
            return true;
        }else{
            return false;
        }
    }

    static boolean isContain(int n){
        String s = String.valueOf(n);

        if(
            s.contains("3") || 
            s.contains("6") ||
            s.contains("9")
        ){
            return true;
        }else{
            return false;
        }
    }
}