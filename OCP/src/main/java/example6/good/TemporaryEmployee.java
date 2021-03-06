package example6.good;

public abstract class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double CalculateBonus(double salary) {
        return salary * 0.45;
    }
}
