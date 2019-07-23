package com.learning.solid.example3.good;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class QueryExecutor {
    /**
     *
     * @param query query to be executed
     */
    public static String queryExecutor(String query){
        System.out.println("Executing query...>>"+query);
        return "Query executed Successfully!";
    }
}
