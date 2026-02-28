import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }

        for (int num : set) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}