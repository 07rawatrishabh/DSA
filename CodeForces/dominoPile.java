// A. Domino piling
// time limit per test2 seconds
// memory limit per test256 megabytes
// You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

// 1. Each domino completely covers two squares.

// 2. No two dominoes overlap.

// 3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

// Find the maximum number of dominoes, which can be placed under these restrictions.

// Input
// In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).



import java.util.*;
import java.io.*;

public final class dominoPile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String arr[] = (br.readLine()).trim().split(" ");
        int n= Integer.parseInt(arr[0]);
        int m= Integer.parseInt(arr[1]);
        int ans = 0;
        if(n>=2){
            ans+=(n/2)*m;
        }
        if(n%2!=0)
        ans+=(m/2);
        System.out.println(ans);
    
    }

}
