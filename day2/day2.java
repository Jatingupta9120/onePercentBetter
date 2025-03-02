/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/* #Day2 DSA
Left Rotate the Array by One


403

13
Problem Statement: Given an array of N integers, left rotate the array by one place.

Example 1:
Input:
 N = 5, array[] = {1,2,3,4,5}
Output:
 2,3,4,5,1

*/

import java.util.*;
public class Day2
{
    public static void rotateArray(int arr[],int n){
        //first we will take a new array which will store our all element expect the 1st one and then after putting all element we can just put the stored element to the last place
        //we are creating an temp array 
        int temp[]=new int[n];
        // int first=arr[0];
        //here we are just copying all element from one to last expect the first one
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        // after that we will put that the element we have stored we will put at the end of the array
        temp[n-1]=arr[0];
        
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
        
        
    }
	public static void main(String[] args) {
	    int n=5;
	    int arr[]={1,2,3,4,5};
	    rotateArray(arr,n);
	}
}
