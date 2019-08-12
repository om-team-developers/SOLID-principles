package main.java.com.learning.solid.example1.good;

/**
 * Created by ankit07 on 7/29/19.
 */
public class LoanApprovalHandler {

    public void approveLoad(Validator validator){
        if(validator.isValid()){
            System.out.println("Loan granted");
        }else{
            System.out.println("Loan not granted");
        }
    }
}
