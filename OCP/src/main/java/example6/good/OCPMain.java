package example6.good;

public class OCPMain {
    public static void main(String[] args) {
        Employee permanentEmployee = new PermanentEmployee(1, "Permanent Employee");
        Employee temporaryEmployee = new TemporaryEmployee(1, "Temporary Employee") {
        };
        System.out.println("Employee :::: " + permanentEmployee.Name + " has bonus of ::::" + permanentEmployee.CalculateBonus(30000));
        System.out.println("Employee :::: " + temporaryEmployee.Name + " has bonus of ::::" + temporaryEmployee.CalculateBonus(15000));
    }
}
