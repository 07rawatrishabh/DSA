/*
Petya and Strings
time limit per test2 seconds
memory limit per test256 megabytes
Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters. */


import java.util.*;
import java.io.*;

public final class petersString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int n = a.length();
        int m = b.length();
        for (int i = 0; i < n; i++) {
            char c = a.charAt(i);
            char d = b.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (d >= 'a' && d <= 'z') {
                    if (c != d) {
                        if (c < d) {
                            System.out.println("-1");
                            return;
                        } else {
                            System.out.println("1");
                            return;
                        }
                    }
                } else {
                    d = (char) (d + 32);
                    if (c != d) {
                        if (c < d) {
                            System.out.println("-1");
                            return;
                        } else {
                            System.out.println("1");
                            return;
                        }
                    }

                }
            } else {
                if (d >= 'a' && d <= 'z') {
                    c = (char) (c + 32);
                    if (c != d) {
                        if (c < d) {
                            System.out.println("-1");
                            return;
                        } else {
                            System.out.println("1");
                            return;
                        }
                    }

                } else {
                    if (c != d) {
                        if (c < d) {
                            System.out.println("-1");
                            return;
                        } else {
                            System.out.println("1");
                            return;
                        }
                    }
                }
            }

        }
        System.out.println(0);

    }

}
