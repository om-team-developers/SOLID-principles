package main.java.com.learning.solid.example1.good;

/**
 * Created by ankit07 on 7/29/19.
 */
public class Application {

    public static void main(String[] args) {
        LoanApprovalHandler loanApprovalHandler = new LoanApprovalHandler();


        //Personal
        PersonalLoanValidator personalLoanValidator = new PersonalLoanValidator();
        personalLoanValidator.setParams("XYZPER");  // Contains PER

        loanApprovalHandler.approveLoad(personalLoanValidator);


        // Vehicle
        VehicleLoanValidator vehicleLoanValidator = new VehicleLoanValidator();
        vehicleLoanValidator.setParams("CAR_BIKE"); //Doesn't contain VEH

        loanApprovalHandler.approveLoad(vehicleLoanValidator);
    }
}
