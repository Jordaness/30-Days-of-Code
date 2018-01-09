//Task is listed here  - https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void prime(int n)
    {
        if(n ==1)
            System.out.println("Not prime");
        else{
            int temp = 0;
            
            for(int i = 2; i*i <= n; i++){
               if(n%i == 0){
                  temp++;
                  break;
               }
            }
            System.out.println((temp > 0) ? "Not prime" : "Prime");
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Input Scanner
        Scanner in = new Scanner(System.in);
        //Receiving input count
        int count = in.nextInt();
        int n = 0;
        //running prime calc
        for(int i = 0; i < count; i++)
        {
           n = in.nextInt();
           prime(n);
        }
    }
}
