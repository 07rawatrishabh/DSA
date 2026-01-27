import java.util.*;
import java.io.*;

public final class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int m = Integer.parseInt(br.readLine());
            String s[] = br.readLine().trim().split(" ");
            int a[] = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = Integer.parseInt(s[i]);
            }

            if (a[0] == -1 && a[m - 1] == -1) {
                a[0] = 0;
                a[m - 1] = 0;
            } else if (a[0] == -1) {
                a[0] = a[m - 1];
            } else if (a[m - 1] == -1) {
                a[m - 1] = a[0];
            }

            for (int i = 1; i < m - 1; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }
            System.out.println(Math.abs(a[0] - a[m - 1]));
            // System.out.println();
            for (int i = 0; i < m; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }

}
