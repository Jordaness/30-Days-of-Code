import java.io.*;
import java.util.*;

//User enters lecture count, then student count, and students needed in order to begin class, then arrival time for each student
//Program Outputs if a class is held, "YES" = class in session, "NO" = cancelled
//Note: Negative arrival time designates an early arrival, and positive arrival time is how many minutes a student is late

public class Solution {

    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        int lectures = in.nextInt();
        int students;
        int threshold;
        
      
        //Get lecture count from the Teacher
        for(int i = 0; i < lectures; i++){
            students = in.nextInt();
            threshold = in.nextInt();
            int[] arrival = new int [students];
            for(int j = 0; j < students; j++)
            {
                arrival[j] = in.nextInt();
            }
            
            //Checking Arrival Times for late students
            int count =0;
            for(int temp : arrival)
            {
                if(temp <= 0)
                {
                    count++;
                }
            }
            
            //Printing if the class will be held based on attendance
            System.out.println((count>=threshold) ? "NO" : "YES");
        }
    
    }
}

/* Tested against the following input:
  5
  4 3
  -1 -3 4 2
  5 2
  0 -1 2 1 4
  8 4
  0 -2 -5 1 3 5 7 9
  7 3
  0 -1 -3 5 6 3 1
  6 4
  -5 -3 0 3 5 4
  */
