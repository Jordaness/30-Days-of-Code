//Witten in C#
//Task is listed here - https://www.hackerrank.com/challenges/30-binary-numbers/problem

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string binary = Convert.ToString(n, 2);
        int count = 0;
        n = 0;
        for(int i = 0; i < binary.Length; i++)
        {
            if(binary[i] == '1')
            {
                n++;
                if(n > count)
                {
                   count = n; 
                }
            }
            else
            {
                n = 0;
            }
        }
        Console.WriteLine(count);
    }
}
