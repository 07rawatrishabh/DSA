import java.util.*;
import java.io.*;

public final class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];
        int k = n;
        while (k-- > 0) {
            arr[k] = br.readLine();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            // System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '1') {
                    c++;
                }
            }
            // System.out.println(c);
            if (c > 1) {
                ans++;
            }
        }
        System.out.println(ans);

    }

}
