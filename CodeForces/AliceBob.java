/*
Alice and Bob have a bag with n
 marbles, with the integer vi written on the i-th marble. They play the following game: first, each player chooses an integer (let's denote the integer chosen by Alice as a
, and the integer chosen by Bob as b
). After that, they start drawing marbles from the bag in any order until the bag is empty. For each ball, the point goes to the one whose chosen integer is closer to the integer on the marble; in case of a tie, Alice gets the point.

For example, if a=10
, b=30
, then

for marbles with integers 10,1,7,18,20
, and many others, Alice gets the points (note that she will get a point for the marble 20
);
for marble with integer 59,25,30,21
, and many others, Bob gets the points.
Bob has managed to find out in advance which integer Alice will choose. Help him to choose his integer in such a way as to maximize the number of points he receives.

*/


import java.util.*;
import java.io.*;

public final class AliceBob {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);   // number of marbles
            int a = Integer.parseInt(s[1]);   // Alice's number

            String[] s1 = br.readLine().trim().split(" ");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s1[i]);
            }

            int left = 0;   // v < a
            int right = 0;  // v > a

            for (int i = 0; i < n; i++) {
                if (arr[i] < a) {
                    left++;
                } else if (arr[i] > a) {
                    right++;
                }
            }

            // Choose the side with more marbles
            if (right >= left) {
                System.out.println(a + 1);
            } else {
                System.out.println(a - 1);
            }
        }
    }
}
