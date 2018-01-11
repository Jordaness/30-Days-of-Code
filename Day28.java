//Task is listed here - https://www.hackerrank.com/challenges/30-regex-patterns/problem

import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String check = ".+@gmail\\.com$";
        
        Pattern p = Pattern.compile(check);
        List<String> output = new ArrayList();
            
            
        for(int i = 0; i < n; i++){
            String name = scan.next();
            String email = scan.nextLine();
            Matcher m = p.matcher(email);
            
            if(m.find()){
                output.add(name);
            }
        }
        
        Collections.sort(output);
        
        
        for(String person : output){
            System.out.println(person);
        }
    }
}
