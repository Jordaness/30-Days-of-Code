//Written in C#
//Task is listed here - https://www.hackerrank.com/challenges/30-recursion/problem

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int factorial(int n) {
        // Complete this function
        if (n == 1)
        {
            return n;
        }
        else
        {
          n = n * factorial(n-1);
          return n;  
        }
     }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int result = factorial(n);
        Console.WriteLine(result);
    }
}
