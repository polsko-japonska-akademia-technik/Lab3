// autorzy Adrian Witkowski & Matyszczak
// data wykonania 6.04.2019
// cel: Employee




public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String Name;

    public Employee (int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName()
    {
        return firstName+lastName;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary=salary;
    }

    public int getAnnualSalary()

    {
        return salary * 12;
    }

    public int raiseSalary(int percent)
    {
    return percent/salary*100;
    }

    public String toString()
    {
        return "Employee id="+id+",Name "+Name+", salary = " +salary;
    }

}