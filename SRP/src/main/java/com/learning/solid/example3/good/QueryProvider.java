package com.learning.solid.example3.good;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class QueryProvider {
    /**
     * @return sample query 1
     */
    public static String getQuery1(){
        return "Select * from table1 where id = 1";
    }

    /**
     * @return sample query 2
     */
    public static String getQuery2(){
        return "Select * from table1 where id = 2";
    }

    /**
     * @return sample query 3
     */
    public static String getQuery3(){
        return "Select * from table1 where id = 3";
    }
}
