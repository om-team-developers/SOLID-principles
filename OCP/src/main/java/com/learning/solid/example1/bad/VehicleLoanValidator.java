package main.java.com.learning.solid.example1.bad;

/**
 * Created by ankit07 on 7/29/19.
 */
public class VehicleLoanValidator {

    public Boolean isValid(String params){
        if( params.contains("VEH")){
            return true;
        }else {
            return false;
        }
    }
}
