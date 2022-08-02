
package Chapter_6;

public class TestToString2 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
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

    @Override
    public String toString() 
    {
        return "Employee["
                + this.firstName + " "
                + this.lastName + "]";
    }
    
    //Above has the class name hard coded into it. You can improve this
    //by using the getClass() method, as below:
/*    
    public String toString()
    {
        return this.getClass().getName() + "[" + 
                this.firstName + " " +
                this.lastName + "]";
    }
*/
}
