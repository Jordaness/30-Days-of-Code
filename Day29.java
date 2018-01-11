//Task is listed here - https://www.hackerrank.com/challenges/30-bitwise-and/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static int bitwiseAnd(int number, int kool){
        //holder for storing the bitwise values
        List<Integer> temp = new ArrayList<Integer>();
        //creating the number set
        int []set = new int[number];
        for(int i =0; i < number; i++){
            set[i] = i+1;
        }
       //storing the bitwise values from the number set
        for(int j = 0; j < number; j++){
            for(int k = 1; k < number-j; k++){
                temp.add(set[j]&set[k+j]);
            }
        }
        //grabbing the highest bitwise value under kool
        int high = 0;
        for(int i = 0; i < temp.size(); i++){
            if(temp.get(i) > kool)
                break;
            if(high < temp.get(i) && temp.get(i) < kool)
                high = temp.get(i);
        }
        
        return high;  
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i = 0; i < t; i ++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            
            System.out.println(bitwiseAnd(n,k));
        }
    }
}
