import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (!check(o)) {                      
            System.out.println("False");
            return;                           
        }
        System.out.println(a + " " + o + " " + c + " = " + cal(a, o, c));
    }

    static boolean check(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    static int cal(int x, char op, int y) {
        switch (op) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            case '/': return x / y;
            default:  return 0;               
        }
    }
}