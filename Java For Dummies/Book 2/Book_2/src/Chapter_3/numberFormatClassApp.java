//3.6   number formatter

package Chapter_3;

import java.text.NumberFormat;

public class numberFormatClassApp {
    
    //class variable, so can be used by any methods in this class.
    static NumberFormat cf = NumberFormat.getCurrencyInstance();    
    
    public static void main(String[] args) 
    {
        printMyAllowance();
        printCostOfPaintballGun();
        
    }
    
    public static void printMyAllowance()
    {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
                System.out.println("My Allowance: " + cf.format(myAllowance));
    }
    
    public static void printCostOfPaintballGun()
    {
        double costOfPaintballGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: " + cf.format(costOfPaintballGun));
    }
}
