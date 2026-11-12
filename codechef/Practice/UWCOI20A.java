// Problem: UWCOI20A
// Platform: codechef
// Language: import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int x=-999;
		for (int i=0;i<n ;i++ ){
		    if(N>x){
		        return ;
		    }
		    else{
		        return -1;
		    }
		} 

	}
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/UWCOI20A?tab=Help
// Solved on: 2026-11-12T14:34:58.989Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maximum = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > maximum) {
                    maximum = arr[i];
                }
            }

            System.out.println(maximum);
        }
	}
}