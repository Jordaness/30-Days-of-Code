// Task is listed here: https://www.hackerrank.com/challenges/30-class-vs-instance/problem

import java.io.*;
import java.util.*;

class Person {
  public int age;     
	public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge < 0){
            age = 0;
            Console.WriteLine("Age is not valid, setting age to 0.");
        }
        else{
            age = initialAge;
        }
  }
   
  public void amIOld(){
        // Do some computations in here and print out the correct statement to the console
         if(age < 13){
             Console.WriteLine("You are young.");
         }
         else if(age >=13 && age <18){
             Console.WriteLine("You are a teenager.");
         }
         else{
             Console.WriteLine("You are old.");
         }
  }

 public void yearPasses(){
    // Increment the age of the person in here
     age++;
 }
     
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
    
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
     }
		sc.close();
  }
}
