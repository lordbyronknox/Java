package Chapter_6;

public class TestEquality2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        
        if (emp1.equals(emp2)) {                                    //compares Employee objects using equals() method
            System.out.println("These employees are the same.");
        } else {
            System.out.println("These are different employees.");
        }
    }
}

class Employee {                                            

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public boolean equals(Object obj) {         //overriden equals() method
// an object must equal itself
        if (this == obj) {                      //true, if same objects are being compared
            return true;                        //(an object must always be equal to itself)
        }

// no object equals null
        if (this == null) {                     //false, if equal to null
            return false;                       //(nothing is equal to null)
        }
// objects of different types are never equal
        if (this.getClass() != obj.getClass()) {    //comares the object's types
            return false;
        }

// cast to an Employee, then compare the fields.
// Having slid through the other tests, you can assume that you’re comparing two 
// different Employee objects, so the next step is to cast the other object to an Employee.
        Employee emp = (Employee) obj;

        return this.lastName.equals(emp.getLastName())
                && this.firstName.equals(emp.getFirstName());
    }
}
