 /*
A. Team
time limit per test2 seconds
memory limit per test256 megabytes
One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution. */

import java.util.*;
import java.io.*;

 public final class Team {

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
 
