
package Chapter_6;

public class TestToString 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Martinez", "Anthony");
        System.out.println(emp.toString());
        
        // println automatically calls the toString method, so the below works too:
        System.out.println(emp);
    }
}

class Employee 
{
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) 
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
