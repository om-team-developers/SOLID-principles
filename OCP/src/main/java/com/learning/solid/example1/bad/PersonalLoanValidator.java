package main.java.com.learning.solid.example1.bad;

/**
 * Created by ankit07 on 7/29/19.
 */
public class PersonalLoanValidator {

    public Boolean isValid(String params){
        if( params.contains("PER")){
            return true;
        }else {
            return false;
        }
    }
}
