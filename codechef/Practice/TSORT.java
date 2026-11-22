// Problem: TSORT
// Platform: codechef
// Language: import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        // Read the elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Print the sorted elements
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/sorting-new/SORTING01/problems/TSORT?tab=Help
// Solved on: 2026-11-22T09:38:38.291Z

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        // Read the elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Print the sorted elements
        for (int x : arr) {
            System.out.println(x);
        }
    }
}