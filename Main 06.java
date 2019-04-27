// autorzy Adrian Witkowski
// data wykonania 27.04.2019
// cel: Employee 06
import java.util.Date;

public class Employee {
    private int id;
    private int salary;
    private String Name;
    private Date dateOfJoining;

    public Employee (int id, String Name, int salary)
    {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
        this.dateOfJoining = new Date();
    }

    public String toString()
    {
        return "Employee id="+id+",Name "+Name+", salary = " +salary+", date of joining = "+dateOfJoining;
    }

}

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}