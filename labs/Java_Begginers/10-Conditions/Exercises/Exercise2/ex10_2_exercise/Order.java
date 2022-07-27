
package ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    /*- Nonprofits get a 10% discount if their order is > 900, 
       otherwise it's 5%
     - Private types get 7% if order is > 900, otherwise no discount.
     - Corporate types get 8% if order < 500, otherwise they get 5%.*/
    public void calcDiscount() {
         if (custType == NONPROFIT)
             if(total > 900){discount = 10;}
             else discount = 5;
         if (custType == PRIVATE)
             if (total > 500) {discount = 5;}
             else discount = 0;
         if (custType == CORP)
             if (total < 500) {discount = 8;}
             else discount = 5;
    }
}
