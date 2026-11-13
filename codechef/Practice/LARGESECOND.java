// Problem: LARGESECOND
// Platform: codechef
// Language: import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int j=0;j<m ;j++ ){
               if (arr[i]<j){
                   arr[i]==maximum
               }
               else if{
                   return arr[i-1];
               }
            } 
            
            
        }
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/LARGESECOND?tab=Help
// Solved on: 2026-11-13T12:40:43.189Z

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = a[i];
                } else if (a[i] > secondMax && a[i] != firstMax) {
                    secondMax = a[i];
                }
            }

            int maxSum = firstMax + secondMax;
            System.out.println(maxSum);
        }

        scanner.close();
    }
}