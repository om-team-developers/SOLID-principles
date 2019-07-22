package example6.good;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int id, String name)  {
        super(id, name);
    }

    @Override
    public double CalculateBonus(double salary) {
        return salary * 0.50;
    }
}
