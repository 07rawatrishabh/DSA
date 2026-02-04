/*
You've been staring at your computer screen for too long; it is time to give it a break and go touch some grass.

Your screen is a line of length a, and there are n
 tabs displayed on it. You want to close all of the tabs by clicking on the x's at their right endpoint.

Every tab is a segment of length len=min(b,am), where m
 is the number of remaining tabs. The tabs are always tightly arranged in sequence from the left endpoint of the screen; that is, the x's will be at len,2⋅len,3⋅len,…,m⋅len
 units away from the left endpoint. Please note that the length of each tab will change as you are closing tabs.

Now your cursor is at the left endpoint of the screen. You wonder what the minimum number of times you need to move the mouse to close all tabs is.

If you have difficulty understanding the statement, you may also refer to your browser tab for a visualization, or click here.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤104
). The description of the test cases follows.

Each test case is a line of three integers a
, b
, and n
 (1≤b≤a≤109
, 1≤n≤109
).

Output
For each test case, output a single integer — the minimum number of times you need to move the mouse to close all tabs.
*/


import java.util.*;
import java.io.*;

public final class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
         
            int a = Integer.parseInt(s[0]);   
            int b = Integer.parseInt(s[1]);   
            int n = Integer.parseInt(s[2]);  

            int moves = 1;
           // System.out.println(a + " " + b + " " + n);
            while((a/n) < b) {
                moves++;
                n--;
            }
            System.out.println(moves);
        }
    }
}
