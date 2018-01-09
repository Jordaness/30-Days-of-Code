//This submission was made in C# (I've submitted in both languages prior to this and hadn't done this solution in java)
//Task is listed here - https://www.hackerrank.com/challenges/30-review-loop/problem

using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int run = 0;
        string temp;
        string even = "";
        string odd = "";
        
       //Input how many words there will be
       run = int.Parse(Console.ReadLine());
        
       for(int i = 0; i < run; i++)
       {
           temp = Console.ReadLine();
       
         for(int j = 0; j < temp.Length; j++)
           {
               if(j%2 == 0)
               {
                   even = even + temp[j];
                   temp[j].Equals(null);
               }
               else if(j%2 == 1)
               {
                   odd = odd +temp[j];
                   temp[j].Equals(null);
               }
           }
           Console.WriteLine("{0} {1}",even, odd);
           even = null;
           odd = null;
       }
        
    }
}
