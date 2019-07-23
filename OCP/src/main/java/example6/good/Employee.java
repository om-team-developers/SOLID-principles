package example6.good;

public abstract class Employee {
    public int ID;
    public String Name;

    public Employee()
    {
    }

    public Employee(int id, String name )
    {
        this.ID = id; this.Name = name;
    }

    public abstract double CalculateBonus(double salary);

}
