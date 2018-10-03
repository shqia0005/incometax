/*
 * To calc the taxable income.
 * Jessica Qiao
 * October 2,2018
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author shqia0005
 */
public class Incometax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        long salary;
        double income;
        double tax1= 0.15;
        double tax2= 0.205;
        double tax3= 0.26;
        double tax4= 0.29;
        double tax5= 0.33;
        
        
        System.out.println("Enter the value of your salary ");
        salary = keyedInput.nextLong();
        
        if (salary <= 46605){
            income = salary* tax1;  
        System.out.println("Your taxable income is $" + income +".");
    }
        
        if (salary > 46605 && salary < 93208){
            income = salary* tax2;  
        System.out.println("Your taxable income is $" + income +".");
    }
        
        if (salary > 93208 && salary < 144489){
            income = salary* tax3;  
        System.out.println("Your taxable income is $" + income +".");
    }
        
        if (salary > 144489 && salary < 205842){
            income = salary* tax4;  
        System.out.println("Your taxable income is $" + income +".");
    }
        
        if (salary > 205842){
            income = salary* tax5;  
        System.out.println("Your taxable income is 4" + income +".");
    }
    }
    
}
