//4.1 

// == :  compares left and right expressions - returns true is they are equal.
// != :  compares left and right expressions - returns true is they are NOT equal.
// <  :  true, if expression on the left is smaller than the right expression.
// <= :  true, if expression on the left is smaller OR EQUAL to the right expression.
// >  :  true, if left is bigger than right.
// >= :  true, if left is bigger OR EQUAL to right.
//NOTE: DO NOT USE THE ABOVE RELATIONAL OPERATORS TO COMPARE STRINGS.

//LOGICAL OPERATORS
// ! = Not. (Unary). Returns true if operand to the right evaluates to fasle.
// & = And. (Binary). Returns true if both operands on either side evaluate to true.
// | = Or. (Binary).  Returns true if either operand evaluates to true.
// ^ = Xor... or 'EXCLUSIVE OR'. (Binary). Returns true if ONE operand evaluates to true and the other false. 
//                    (False is both are true or false).
// && = Conditional And. (Binary). Same as &, but returns false if left operand is false
//                      without evaluating the right operand.
// || = Conditional Or. (Binary). Same as |, but returns true if left operand evaluates to
//                      true without evaluation the right operand.

//TENARY OPERATOR
// ?:   =   replaces the 'if statement' in some cases.
//eg. a ? b : c     =   if a = true, then apply b, else apply c.

//COMPARING STRINGS
// Useing the == operators to compare strings is not recomemded as the == comapres the references 
//  to the objects, rather than the objects themselves.  (i.e it checks if the references point 
//  to the same object in memory, and not the value of the references.
//  Use the equals() method:    if(answer.equals("yes"))   ...rather than... if(answer == "yes")
//  The equals() method compares the values of the string objects referenced.
//  equalsIgnoreCase() = same as equals() but not case sensitive.





package Chapter_4;

public class RelationalOperators {
    
}
