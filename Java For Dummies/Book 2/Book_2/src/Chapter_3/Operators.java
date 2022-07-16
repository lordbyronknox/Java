//Operators
//3 categories of operators by number of operands:
//  Unary operators = works on one operand.  eg: -x  (which negates x) or x++ (increments x)
//  Binary operators = works on two operands. eg 1 + 2 ...or... x > y
//  Ternary operators = works on 3 operands. only one in java is (?:)
//  eg.     x ? y : z;
//
//Operator order of precedence:
//  parentheses always go first. Inner parentheses go first, then outer. eg (a * (a+b))
//  1st - increments(++) and decrements(--)
//  2nd - sign operators(+ or -)
//  3rd - multiplication(*), division(/), and remainder(%)
//  4th - addition(+) and subtraction(-)
//
//Compound operators:
//  +=, -=, *=, /=, %=
//  performs a calculation and an assignment.

package Chapter_3;


public class Operators {
    //operators with int:
    int a = 32, b = 5;
    int c = a + b;          // c is 37
    int d = a - b;          // d is 27
    int e = a * b;          // e is 160
    int f = a / b;          // f is 5 (32 / 5 is 6 remainder 2)
    int g = a % b;          // g is 2 (32 / 5 is 6 remainder 2) ('Remainder' or 'Modulous' operator)
    //a++;                     a is now 33
    //b--;                     b is now 4
    
    //dividing two int values always produces an int, the remainder is dropped, not rounded up:
    int a1 = 21, b1 = 6;
    double answer = a1 / b1;    //answer is 3.0... and not 3.5
    //cast to change the answer type
    double answerCast = (double) a/b;   //...= 3.5
    
    //operators with double:
    double x = 5.5, y = 2.0;
    double m = x + y;       // m is 7.5
    double n = x - y;       // n is 3.5
    double o = x * y;       // o is 11.0
    double p = x / y;       // p is 2.75
    double q = x % y;       // q is 1.5
    //x++;                  // x is now 6.5
    //y--;                  // y is now 1.0


}
