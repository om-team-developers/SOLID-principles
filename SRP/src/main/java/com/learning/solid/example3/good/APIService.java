package com.learning.solid.example3.good;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class APIService {

    /**
     *
     * @param arg argument
     * @return Query status
     */
    public static String getResponse(String arg) {
        String query;
        switch (arg) {
            case "1":
                query = QueryProvider.getQuery1();
                break;
            case "2":
                query = QueryProvider.getQuery2();
                break;
            case "3":
                query = QueryProvider.getQuery3();
                break;
            default:
                return "Wrong Argument!";

        }
        return QueryExecutor.queryExecutor(query);
    }
}
