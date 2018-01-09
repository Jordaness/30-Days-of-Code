import java.util.*;
import java.math.*;

/*
Given the meal price, tip percen, and tax percent for a meal, find and print the meal's total cost. 
Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!
*/

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double totalPercent = (double)(tipPercent+taxPercent)/100;
        mealCost = mealCost * (1+totalPercent);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
