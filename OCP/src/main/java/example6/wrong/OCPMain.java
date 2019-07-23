package example6.wrong;

public class OCPMain {
    public static void main(String[] args) {
        Employee permanentEmployee = new Employee(1, "Permanent Employee", "Permanent" );
        Employee temporaryEmployee = new Employee(2, "Temporary Employee", "Temporary");
        System.out.println("Employee :::: " + permanentEmployee.Name + " has bonus of ::::" + permanentEmployee.CalculateBonus(30000));
        System.out.println("Employee :::: " + temporaryEmployee.Name + " has bonus of ::::" + temporaryEmployee.CalculateBonus(15000));
    }
}
