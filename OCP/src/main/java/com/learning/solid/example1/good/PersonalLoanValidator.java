package main.java.com.learning.solid.example1.good;

/**
 * Created by ankit07 on 7/29/19.
 */
public class PersonalLoanValidator extends Validator {

    @Override
    public void setParams(String inputParam) {
        this.params = inputParam;
    }
    @Override
    public Boolean isValid(){
        if( params.contains("PER") ){
            return true;
        }else {
            return false;
        }
    }

}
