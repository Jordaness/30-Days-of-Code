//Submitted in C#
//Task is listed here - https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    public static void check(string s, Dictionary<string, string> d)
    {
        if(d.ContainsKey(s))
        {
            Console.WriteLine("{0}={1}", s, d[s]);
        }
        else
        {
            Console.WriteLine("Not found");
        }
    }
    static void Main(String[] args) {
       int count = 0;
       Dictionary<string, string> pBook = new Dictionary<string, string>();
       string input;
       string [] info;
        
       count = int.Parse(Console.ReadLine());
       for(int i = 0; i < count; i++)
       {
           input = Console.ReadLine();
           info = input.Split(' ');
           pBook.Add(info[0], info[1]);
       }
        for(int j = 0; j < count; j++)
       {
           input = Console.ReadLine();
           check(input, pBook);
       }
             
    }
}
