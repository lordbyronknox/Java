/*

 */
package Page557.BirthdayFunApplication;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.*;

public class BirthdayFun {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            LocalDate birthDate;
            DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY"); //create formatter object
            DateTimeFormatter monthDayFormat = DateTimeFormatter.ofPattern("MMMM d");   //create 2nd formatter object

            System.out.println("Today is " + LocalDate.now().format(fullFormat) + "."); //print cur date in fullformat layout.
            System.out.println();
            System.out.print("Please enter your birthdate " + "(yyyy-mm-dd): ");
            String input = sc.nextLine();                                               //user input assigned to 'input'.
            
            try {
                birthDate = LocalDate.parse(input);                                     //parse input to LocalDate format 
                if (birthDate.isAfter(LocalDate.now())) {                               //check if input is valid (not in the future)
                    System.out.println("You haven't been born yet!");
                    continue;
                }
                System.out.println();
                System.out.println(birthDate.format(fullFormat)                  //print bday
                        + " was a very good day!");
                DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();             //get day of the week bday fell on.
                System.out.println("You were born on a " + birthDayOfWeek + ".");
                long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS); //get years from bday till cur date.
                System.out.println("You are " + years + " years young.");
                LocalDate nextBDay = birthDate.plusYears(years + 1);             //get date of next bday.
                System.out.println("Your next birthday is "
                        + nextBDay.format(fullFormat) + ".");
                long wait = LocalDate.now().until(nextBDay,                      //get days till next bday
                        ChronoUnit.DAYS);
                System.out.println("That's just " + wait
                        + " days from now!");
                LocalDate halfBirthday = birthDate.plusMonths(6);               //get 'half-bday' (bday + 6months)
                System.out.println("Your half-birthday is "
                        + halfBirthday.format(monthDayFormat) + ".");
            } catch (DateTimeParseException ex) {                               //catch error for incorrect input.
                System.out.println("Sorry, that is not a valid date.");
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.println();
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }

}
