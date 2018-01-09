//Task is listed here - https://www.hackerrank.com/challenges/30-more-exceptions/submissions/code/60902871

import java.util.*;
import java.io.*;

//Write your code here
class Calculator
{
    int n;
    int p;
            
    int power(int note, int pow) throws Exception
    {
        if(note < 0 || pow < 0)
            throw new Exception("n and p should be non-negative");
        else{
            this.n = note;
            this.p = pow;
            int ans = 1;
            for(int i = 0; i < p; i++) {
                ans = ans*n;
            }
            return ans;
        }      
    } 
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
