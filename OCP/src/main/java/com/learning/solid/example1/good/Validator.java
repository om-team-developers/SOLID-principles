package main.java.com.learning.solid.example1.good;

/**
 * Created by ankit07 on 7/29/19.
 */
public abstract class Validator {

    public String params;

    public abstract Boolean isValid();

    public abstract void setParams(String inputParam);
}

