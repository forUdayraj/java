/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		int arrsize = sc.nextInt();
		int[] arr = new int[arrsize];
		for (int i=0;i<t ;i++ ){
		    for(int j=0; j<=arrsize-1;j++) {
				arr[j] = sc.nextInt();
			}
		    for(int k=0; k<arrsize-1;k++){
		        if(arr[k+1] > arr[k]){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }

		    }
		}
	}
}
