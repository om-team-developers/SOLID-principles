package example6.wrong;

public class Employee {

    public Employee(int id, String name, String type)
    {
        this.ID = id;
        this.Name = name;
        this.EmployeeType = type;
    }

    int ID;
    String EmployeeType;
    String Name;

    double CalculateBonus(double salary)
    {
        if (this.EmployeeType.equalsIgnoreCase("Permanent"))
            return salary * .50;
        else
            return salary * .45;
    }
}
