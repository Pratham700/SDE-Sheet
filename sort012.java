// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Problem
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0 = count(a, n , 0) ; 
        int count1 = count(a, n, 1) ;
        
        for(int i=0 ; i<n; i++) {
            if(count0 != 0) {
                a[i] = 0 ; 
                count0-- ;
            }else if(count1 != 0 ) {
                a[i] =1 ; 
                count1-- ; 
            }else {
             a[i] = 2;    
            }
        }
    }
    public static int count (int a[], int n, int ele) {
    int count = 0 ; 
    for (int i = 0 ; i<n ;i++) {
        if(a[i] == ele){
            count ++; 
        }
    }
    return count ;
}
}



// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Problem ob=new Problem();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends