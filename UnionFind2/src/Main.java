import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[1000000];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int temp = a[u];
            for (int j = 0; j < n; j++) {
                if (a[j] == temp) {
                    a[j] = a[v];
                }
            }
        }
        // kiểm tra connected
        boolean check = false;
        int u = sc.nextInt();
        int v = sc.nextInt();
        if (a[u] == a[v]) {
            check = true;
        }
    }
}