//2.2 Shadowing, output
//





package Chapter_2;

public class ShadowApp {
    
    static int x;   //Class variable - scope = entire class.
    public static void main(String[] args) {
        
        x = 5;
        System.out.println("x = " + x); //printing class variable x
        int x;      //Local variable: Shadows the class variable. 
        x = 10;     //...its scope starts here (when it is initialized) and ends at end of method.
        System.out.println("x = " + x); //printing local variable x
        System.out.println("ShadowApp.x = " + ShadowApp.x); //printing class variable x (shadowApp.x).
    
        //System.out
        int i = 64;
        int j = 23;
        System.out.print(i);    //print() prints to same line.
        System.out.print(" and ");
        System.out.println(j);  //println() adds a line-feed character (\n) so next print will
                                //be on a new line.
    
    }
}
