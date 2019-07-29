package main.java.com.learning.solid.example1.bad;

/**
 * Created by ankit07 on 7/29/19.
 */
public class LoanApprovalHandler {

    public void approvePersonalLoan(PersonalLoanValidator validator){
        if( validator.isValid("XYZ")){
            //process load
            System.out.println("Personal Load granted");
        }else{
            System.out.println("Personal Loan Not Granted");
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator){
        if( validator.isValid("VEH")){
            //process load
            System.out.println("Vehicle Loan granted");
        }else{
            System.out.println("Vehilce loan not Granted");
        }
    }
}
