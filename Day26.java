//Task is listed here - https://www.hackerrank.com/challenges/30-nested-logic/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static int calcFee(int rDay,int rMonth,int rYear,int eDay,int eMonth,int eYear)
    {
 
        if (rYear > eYear)
            return 10000;
        else if (rYear == eYear ){      
            if (rMonth > eMonth )
                return (rMonth - eMonth) * 500;        
            else if (rMonth == eMonth ){
                if (rDay > eDay)
                    return (rDay - eDay) * 15;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int rtnDay = in.nextInt();
        int rtnMonth = in.nextInt();
        int rtnYear = in.nextInt();
        
        int eDay = in.nextInt();
        int eMonth = in.nextInt();
        int eYear = in.nextInt();
        
        System.out.println(calcFee(rtnDay, rtnMonth, rtnYear, eDay, eMonth, eYear));
        
    }
}
