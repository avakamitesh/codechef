// Problem: RPPS
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/RPPS?tab=statement
// Solved on: 2026-11-21T17:46:15.502Z

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if (S == null) return;
        S = S.trim();
        int N = S.length();
        if (N < 2) {
            System.out.println(0);
            return;
        }
        
        int[] freq = new int[676];
        for (int i = 0; i < N - 1; i++) {
            int code = (S.charAt(i) - 'a') * 26 + (S.charAt(i + 1) - 'a');
            freq[code]++;
        }
        
        int count = 0;
        for (int i = 0; i < 676; i++) {
            if (freq[i] > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}