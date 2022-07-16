//enum: a custome variable type with a limited set of possible values.


package Chapter_2;

public class EnumTest {
    
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}  //definiing an enum, with a list of
                                                            //  posible values.
    public static void main(String[] args) {
        
        CardSuit suit;              //Declaring a variable 'suit' using the enum's name as its type
        suit = CardSuit.HEARTS;     //Assigning a value to the enum variable.
        System.out.println("The suit is " + suit);
    }
}
