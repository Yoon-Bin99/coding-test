import java.util.*;

class Solution {
    boolean[] visited;
    Set<Integer> set;

    public int solution(String numbers) {
        set = new HashSet<>();

        int[] arr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = numbers.charAt(i) - '0';
        }

        for (int target = 1; target <= arr.length; target++) {
            visited = new boolean[arr.length];
            perm(arr, 0, target, new ArrayList<>());
        }

        int answer = 0;
        for (int n : set) {
            if (isPrime(n)) answer++;
        }
        return answer;
    }

    void perm(int[] arr, int depth, int target, List<Integer> cur) {
        if (depth == target) {
            int num = 0;
            for (int d : cur) num = num * 10 + d;
            set.add(num);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            cur.add(arr[i]);
            perm(arr, depth + 1, target, cur);
            cur.remove(cur.size() - 1);   
            visited[i] = false;
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;                      
    }
}