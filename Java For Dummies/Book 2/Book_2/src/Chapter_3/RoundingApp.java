//3.5
//ceil(argument) : returns smallest double, that is an int, >= the argument.
//                  eg 29.4 returns 30.0
//floor(argument): returns largest double, that is an int, <= the argument.
//                  eg 29.4 returns 29.0
//round(argument): returns the int that is closest to the argument.
//                  eg 29.4 returns 29.0
//rint(argument) : returns the double, that is an int, that is closest to the argument.
//                  eg 29.9 returns 30    29.4 returns 29.0


package Chapter_3;


public class RoundingApp
{
public static void main(String[] args)
{
double x = 29.4;
double y = 93.5;
double z = -19.3;

        
System.out.println("round(x) = " + Math.round(x));
System.out.println("round(y) = " + Math.round(y));
System.out.println("round(z) = " + Math.round(z));
System.out.println();
System.out.println("ceil(x) = " + Math.ceil(x));
System.out.println("ceil(y) = " + Math.ceil(y));
System.out.println("ceil(z) = " + Math.ceil(z));
System.out.println();
System.out.println("floor(x) = " + Math.floor(x));
System.out.println("floor(y) = " + Math.floor(y));
System.out.println("floor(z) = " + Math.floor(z));
System.out.println();
System.out.println("rint(x) = " + Math.rint(x));
System.out.println("rint(y) = " + Math.rint(y));
System.out.println("rint(z) = " + Math.rint(z));


}
}
