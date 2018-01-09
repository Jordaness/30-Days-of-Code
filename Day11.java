//Written in C#
//Task is listed here - https://www.hackerrank.com/challenges/30-2d-arrays/problem

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int[][] arr = new int[6][];
        for(int arr_i = 0; arr_i < 6; arr_i++){
           string[] arr_temp = Console.ReadLine().Split(' ');
           arr[arr_i] = Array.ConvertAll(arr_temp,Int32.Parse);
        }
        
        int [] sum = new int [16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                       + arr[i+2][j+2];
               h++;
             }
       }
    Array.Sort(sum);
    Console.WriteLine(sum[15]);

    }
}
