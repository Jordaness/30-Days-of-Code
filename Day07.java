//Written in C#
//Task is listed here - https://www.hackerrank.com/challenges/30-arrays/problem

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
        
        for(int i = n-1; i >= 0; i--)
        {
            Console.Write("{0} ", arr[i]);
        }
    }
}
