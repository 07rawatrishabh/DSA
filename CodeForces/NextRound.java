import java.util.*;
import java.io.*;

public final class  NextRound {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brr[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(brr[0]);
        String temp = "vishal";
        int k = Integer.parseInt(brr[1]);
        String arr[] = (br.readLine()).trim().split(" ");
        int ans = 0;

        if (k == 1) {
            if (Integer.parseInt(arr[0]) == 0) {
                System.out.println(0);
            } else {
                for (int i = 0; i < n; i++) {
                    if (Integer.parseInt(arr[i]) >= 1 && Integer.parseInt(arr[i]) >= Integer.parseInt(arr[0])) {
                        ans++;
                    }
                }

                System.out.println(ans);
            }
        } else { 
            int rans = 0;
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(arr[i]) >= 1 && Integer.parseInt(arr[i]) >= Integer.parseInt(arr[k - 1])) {
                    rans++;
                }
            }
            System.out.println(rans);
        }

        // System.out.println(ans);
    }

}
