
package Page407.BeyondTwoDimensinalArrays;

/**
 *
 * @author byron
 */
public class ThreeDimentional 
{
    public static void main(String[] args) 
    {
        //Initializing a 3d array
        int[][][] threeD = new int[3][3][3];
        
        //Set element 2, in column 1, of row 0, to 100
        threeD[0][1][3] = 100;
        
        //nest initializers
        int[][][] threeB = 
        {
            { {1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} },
            { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
            { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };
        
        //Using nested for loops to populate a 3D array
        int[][][] threeD2 = new int[3][3][3];
        
        int value = 1;
        
        for(int i = 0; i <3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    threeD2[i][j][k] = value++;
    }
       
}
