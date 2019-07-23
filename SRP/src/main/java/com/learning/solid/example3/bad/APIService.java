package com.learning.solid.example3.bad;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class APIService {

    /**

     * @param args command line arguments
     */
    public static void main(String[] args){
        System.out.println(queryRouter(args[0]));
    }

    /**
     *
     * @param query query to be executed
     */
    public static String queryExecutor(String query){
        System.out.println("Executing query...>>"+query);
        return "Executing query...>>";
    }

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
    public static String queryRouter(String router){
        String query;
        switch (router){
            case "1":
                query = getQuery1();
                return queryExecutor(query);
            case "2":
                query = getQuery2();
                return queryExecutor(query);
            case "3":
                query = getQuery3();
                return queryExecutor(query);
            default:
                return "Wrong Argument!";
        }
    }
}
