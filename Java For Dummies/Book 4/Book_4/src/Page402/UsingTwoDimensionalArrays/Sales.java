package Page402.UsingTwoDimensionalArrays;

import java.text.NumberFormat;

/**
 *
 * @author byron
 */
public class Sales {

    public static void main(String[] args) 
    {
        double[][] sales = {                                //Initializing a two-dimensional array:
            {23853.0, 22838.0, 36483.0, 31352.0}, // 2004   //each element/array enclosed in {}
            {25483.0, 22943.0, 38274.0, 33294.0}, // 2005
            {24872.0, 23049.0, 39002.0, 36888.0}, // 2006
            {28492.0, 23784.0, 42374.0, 39573.0}, // 2007
            {31932.0, 23732.0, 42943.0, 41734.0}  // 2008
        }; 

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");

        int year = 2004;
        for (int y = 0; y < 5; y++) 
            {
            System.out.print(year + "\t");
            for (int region = 0; region < 4; region++) {
                System.out.print(cf.format(sales[y][region]));
                System.out.print("\t");
            }
            year++;
            System.out.println();
            }
    }
}

