//Task is listed here - https://www.hackerrank.com/challenges/30-scope/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    // Add your code here
    public Difference(int [] arr_i){
        this.elements = arr_i;
    }

    public void computeDifference(){
        for(int i = 0; i < elements.Length; i++){
            for(int j = 0; j < elements.Length; j++){
                int diff = Math.Abs(elements[i] - elements[j]);
                if(diff >= this.maximumDifference)
                    this.maximumDifference = diff;
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
