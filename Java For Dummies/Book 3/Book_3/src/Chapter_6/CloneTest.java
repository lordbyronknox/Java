package Chapter_6;


public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        emp1.setSalary(40000.0);
        Employee emp2 = (Employee) emp1.clone();        //creates a clone of emp1
        emp1.setLastName("Smith");                      //change last name of emp1 to show it is
        System.out.println(emp1);                       // a different object to emp2.
        System.out.println(emp2);
    }
}

class Employee {

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Object clone() {
        Employee emp;
        emp = new Employee(this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
