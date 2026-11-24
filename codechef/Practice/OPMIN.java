// Problem: OPMIN
// Platform: codechef
// Language: import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int[] A= new int[n];
		    int count=0;
		    for(int i=0;i<n;i++){
		        A[i]=sc.nextInt();
		    }
		    Arrays.sort(A);
		   int x=A[0];
		    for(int i=0;i<n;i++){
		        if(A[i]>x){
		            A[i]=x;
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/OPMIN?tab=Help
// Solved on: 2026-11-24T12:20:03.941Z

import java.io.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        A[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(A);
		    int min = A[0];
		    int count = 0;
		    
		    // Count how many elements are strictly greater than the minimum
		    for(int i = 0; i < n; i++){
		        if(A[i] > min){
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		}
		sc.close();
	}
}