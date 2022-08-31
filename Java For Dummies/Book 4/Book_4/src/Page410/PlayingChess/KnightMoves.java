
package Page410.PlayingChess;

import java.util.Scanner;


/**
 *
 * @author byron
 */
public class KnightMoves 
{
    static Scanner sc = new Scanner(System.in);
    
    //Array representing the 8 possible moves a knight can make, using an 8rows x 2columns array.
    static int[][] moves = 
    { 
        {-2, +1},       //x and y axis: 2 left, 1 up.
        {-1, +2},
        {+1, +2},
        {+2, +1},
        {+2, -1},       //2 right, 1 down.
        {+1, -2},
        {-1, -2},
        {-2, -1} 
    };
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Knight move calculator.\n");
        
        do {
            showKnightMoves();
            }
        while (getYorN("Do it again?"));
    }
    
    public static void showKnightMoves()
    {
        // The first dimension is the file(columns) (a, b, c, etc.)
        // The second dimension is the rank(rows) (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5. (from bottom right corner: 3 right, 5 up)
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8];
        
        String kSquare;     //The knights position as a square
        Pos kPos;           //The knights position as a Pos
        
        //Get the knight's initial position
        do
        {
            System.out.print("Enter the Knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        }
        while (kPos == null);
        
        board[kPos.x][kPos.y] = 1;      //set to 1, to show the knight's position.
        System.out.println("\nThe knight is at square " + convertPosToSquare(kPos));
        System.out.println("From here the Knight can move to: ");
        
        for (int move = 0; move < moves.length; move++)
        {
            int x, y;
            x = moves[move][0];     //the x for this move.
            y = moves[move][1];     //the y for this move.
            Pos p = calculateNewPos(kPos, x, y);
            if (p != null)
            {
                System.out.println(convertPosToSquare(p));
                board[p.x][p.y] = 2;
            }
        }
        
        printBoard(board);
    }
    
    
    //method to convert squares (eg. a1, or d5) to x, y coordinates, (eg. [0][0], or [3][4])
    public static Pos convertSquareToPos(String square)
    {
        int x = -1;
        int y = -1;
        char rank, file;
        
        file = square.charAt(0);
        if (file == 'a') x = 0;
        if (file == 'b') x = 1;
        if (file == 'c') x = 2;
        if (file == 'd') x = 3;
        if (file == 'e') x = 4;
        if (file == 'f') x = 5;
        if (file == 'g') x = 6;
        if (file == 'h') x = 7;
        
        rank = square.charAt(1);
        if (rank == '1') y = 0;
        if (rank == '2') y = 1;
        if (rank == '3') y = 2;
        if (rank == '4') y = 3;
        if (rank == '5') y = 4;
        if (rank == '6') y = 5;
        if (rank == '7') y = 6;
        if (rank == '8') y = 7;
        
        if (x == -1 || y == -1)
            return null;
        else
            return new Pos(x, y);        
    }
    
    
    //method to convert x, y coordinates (eg. [0][0]) to squares (eg. a1).
    public static String convertPosToSquare(Pos p)
    {
        String file = "";
        
        if (p.x == 0) file = "a";
        if (p.x == 1) file = "b";
        if (p.x == 2) file = "c";
        if (p.x == 3) file = "d";
        if (p.x == 4) file = "e";
        if (p.x == 5) file = "f";
        if (p.x == 6) file = "g";
        if (p.x == 7) file = "h";

        return file + (p.y + 1);
    }
    
    
    //Method to calculate a new Pos given a starting Pos, an x move, and a y move.
    //Returns null if the resulting move is off the board.
    public static Pos calculateNewPos(Pos p, int x, int y)
    {
        // rule out ilegal moves
        if (p.x + x < 0)
            return null;
        if (p.x + x > 7)
            return null;
        if (p.y + y < 0)
            return null;
        if (p.y + y > 7)
            return null;
        
        //return new position
        return new Pos(p.x + x, p.y + y);
    }
    
    
    //method that prints the chess board
    public static void printBoard(int[][] b)
    {
        for (int y = 7; y >=0; y--)
        {
            for (int x = 0; x < 8; x++)
            {
                if (b[x][y] == 1)
                    System.out.print(" X ");
                else if (b[x][y] == 2)
                    System.out.print(" ? ");
                else
                    System.out.print(" - ");
            }
        System.out.println();
        }
    }
          
    
    
    public static boolean getYorN(String prompt)
    {
        while (true)
        {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
    
}
